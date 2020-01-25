/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author zman0_000
 */
public class AnalysisHelper {

// Top 3 best products
    public void bestProduct(){
        
        Map<Integer,Integer> bestProd = new HashMap<Integer,Integer>();
        Map<Integer,Product> prod = DataSource.getInstance().getProduct();
        Map<Integer,Order> order = DataSource.getInstance().getOrder();
        List<Product> p = new ArrayList<>(prod.values());
        
        for (Product p1 : prod.values())
        {
         int count=0;
            for (Order o :order.values())
            {
                for (Item i : o.getItem())
                {
                    if(i.getProductId() == p1.getProductId())
                    {
                        count += i.getOrderTotal(p); 
                    }
                    }
                }
            bestProd.put(p1.getProductId(),count);
        }
        List<Map.Entry<Integer, Integer> > list = new LinkedList<>(bestProd.entrySet());
        
         Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
         @Override
         public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
            
             return o2.getValue() - o1.getValue();
         }
     }); 
       
      System.out.println("Top 3 most popular products: \n");
      for(int i = 0; i<3; i++){

          System.out.println(prod.get(list.get(i).getKey()) + ", Total :" +list.get(i).getValue());
      }
    }
    
    
    // Top 3 best customers
    public void bestCustomer() {
    
        Map<Integer,Integer> bestCustomer = new HashMap<Integer,Integer>();
        Map<Integer,Customer> cust = DataSource.getInstance().getCustomer();
        Map<Integer, Product> prod = DataSource.getInstance().getProduct();
       List<Product> p = new ArrayList<>(prod.values());
        for(Customer c : cust.values()){
        
        int total = 0 ; 
       
            for(Order o : c.getOrder()){
                int OrderTotal = 0 ;
      
                for(Item i : o.getItem()) {
                                    
                    if(bestCustomer.containsKey(c.getId()))
                    {   total = bestCustomer.get(c.getId());}
                           
                    OrderTotal = o.getAllOrdersTotal(o.getItem(),p);
          
            }
               total += OrderTotal ;
                bestCustomer.put(c.getId(), total);             
        }      
    }
         List<Map.Entry<Integer, Integer> > list = new LinkedList<>(bestCustomer.entrySet());
        
         Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
         @Override
         public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
            
             return o2.getValue() - o1.getValue();
         }
     }); 
       
      System.out.println("Top 3 best customers:\n");
      for(int i = 0; i < list.size() && i<3; i++){
        
            System.out.println(cust.get(list.get(i).getKey()) + ", Total :" +list.get(i).getValue());
        
}}

    // Top 3 best salesperson
    public void bestSalesPerson() {

        Map<Integer, Integer> bestProduct = new HashMap<Integer, Integer>();
        
        Map<Integer, Product> prod = DataSource.getInstance().getProduct();
        
        Map<Integer, SalesPerson> salePerson = DataSource.getInstance().getSalePerson();
        List<Product> p = new ArrayList<>(prod.values());

        for (SalesPerson sp : salePerson.values()) {
            int total = 0;
            for (Order o : sp.getOrders()) {
                int OrderTotal = 0;
                for (Item i : o.getItem()) {
                    if (bestProduct.containsKey(sp.getSales_id())) {
                        total = bestProduct.get(sp.getSales_id());
                    }

                    OrderTotal = o.getAllOrdersTotal(o.getItem(), p);
                }

                total += OrderTotal;
                bestProduct.put(sp.getSales_id(), total);
            }
        }
        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<>(bestProduct.entrySet());

        //Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {

                return o2.getValue() - o1.getValue();
            }
        });

        System.out.println("Top 3 Best Sales People: \n");
        for (int i = 0; i < list.size() && i < 3; i++) {
            System.out.println(salePerson.get(list.get(i).getKey()) + ", Total Revenue :" + list.get(i).getValue());
        }
    }
    
    // Total Revenue
    public void totalRevenue(){
        
        Map<Integer, Integer> bestProduct = new HashMap<Integer, Integer>();
        
        Map<Integer,Product> prod = DataSource.getInstance().getProduct();
        
        Map<Integer, SalesPerson> salePerson = DataSource.getInstance().getSalePerson();
        List<Product> p = new ArrayList<>(prod.values());
        
        for (SalesPerson sp : salePerson.values()) {
            int total = 0;
            for (Order o : sp.getOrders()) {
                int OrderTotal = 0;
                for (Item i : o.getItem()) {
                    if (bestProduct.containsKey(sp.getSales_id())) {
                        total = bestProduct.get(sp.getSales_id());
                    }
                    OrderTotal = o.getAllOrdersTotal(o.getItem(), p);
                }
                total += OrderTotal;
                bestProduct.put(sp.getSales_id(), total);
            }
        }
        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<>(bestProduct.entrySet());
        
        int totalRev = 0;
        for(int i=0; i<list.size(); i++){
            totalRev += list.get(i).getValue();
        }
        System.out.println("Total  Revenue :\n" + totalRev);
    
    
    }

}
