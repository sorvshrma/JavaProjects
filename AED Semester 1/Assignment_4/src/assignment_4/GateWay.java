/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import assignment_4.analytics.AnalysisHelper;
import assignment_4.analytics.DataSource;
import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author harshalneelkamal
 */
public class GateWay  {
        
    
        DataReader productReader;
        DataReader orderReader ;
        AnalysisHelper helper;
        public GateWay() throws IOException {    
        DataGenerator generator = DataGenerator.getInstance();
        productReader = new DataReader(generator.getProductCataloguePath());
        orderReader = new DataReader(generator.getOrderFilePath());
        helper = new AnalysisHelper();
        } 
        
        public static void main(String args[]) throws IOException{
        GateWay inst = new GateWay();
        inst.readData();
    }
    
    private void readData() throws IOException{
        String[] row;
        Product prod = null ; 
        System.out.println("Inside ReadData");
        while((row = productReader.getNextRow()) != null ){
                prod = generateProduct(row);          
        }
        while((row = orderReader.getNextRow()) != null ){
           
            if(prod != null){
                
                Item item = generateItem(row, prod);
                //System.out.println(item); 
                Order order = generateOrder(row, item);
               // System.out.println(order);
                if(order!=null){
                
                generateCustomer(row,order);
                generateSalesPerson(row,order);
                }
            
            }else {
            
            
            System.out.println("Product/Order is null !!");
            }
        }
        
       runAnalysis();
    }
        
    
   private Product generateProduct(String[] row){
       int prodId = 0;
       int minPrice = 0 ;
       int maxPrice = 0 ;
       int targetPrice = 0 ;
       
       try {
            prodId = Integer.parseInt(row[0]);
            minPrice = Integer.parseInt(row[1]);
            maxPrice = Integer.parseInt(row[2]);
            targetPrice = Integer.parseInt(row[3]);
        }catch(Exception e) {
        
           System.out.println("Generate Product : Error while generating Product data from csv file.") ;
        }

       Product prod = new Product(prodId, minPrice, maxPrice,targetPrice);
        DataSource.getInstance().getProduct().put(prodId,prod);
        return prod ;
    }
        
    
    private Item generateItem(String[] row,Product prod){
    
    int itemId =0 ;
    int productId =0 ;
    int salesPrice =0 ;
    int quantity= 0;
    
    try {
            itemId = Integer.parseInt(row[1]);
            productId = Integer.parseInt(row[2]);
            salesPrice = Integer.parseInt(row[6]);
            quantity = Integer.parseInt(row[3]);
            
        }catch(Exception e) {
        
           System.out.println("Generate Item : Error while generating Item data from csv file.") ;
        }
      Item item = new Item(itemId,productId, salesPrice, quantity);
      DataSource.getInstance().getItem().put(itemId,item);
      return item ;
    
    }
    
    private Order generateOrder(String[] row,Item item){
        
    int orderId=0;
    int supplierId=0;
    int customerId=0;
    Order order = null ;
   
    try {
            orderId = Integer.parseInt(row[0]);
            supplierId = Integer.parseInt(row[4]);
            customerId = Integer.parseInt(row[5]);
        }catch(Exception e) {
        
           System.out.println("Generate Order : Error while generating Order data from csv file.") ;
        }
        
       Map<Integer,Order> Order = DataSource.getInstance().getOrder();
       if (Order.containsKey(item.getItemId()))
        Order.get(item.getItemId()).getItem().add(item);
       else {
       order = new Order(orderId,supplierId,customerId) ;
       order.getItem().add(item);
       Order.put(orderId,order);
       
      }
       return order ;
    }   
       
       private void generateCustomer(String[] row ,Order order) {
       
           int id =0 ;
           try {
            id = Integer.parseInt(row[5]);
            
        }catch(Exception e) {
        
           System.out.println("Generate Customer : Error while generating Customer data from csv file.") ;
        }
        Map<Integer,Customer> customer = DataSource.getInstance().getCustomer();
       if(customer.containsKey(order.getCustomerId())){
          customer.get(order.getCustomerId()).getOrder().add(order);
           
           
       }else {
       Customer cust = new Customer (id);
       cust.getOrder().add(order);
       customer.put(id,cust);
       
       
       
       }
       }
       
       
       private void generateSalesPerson(String[] row ,Order order) {
     
           int id =0 ;
           try {
            id = Integer.parseInt(row[4]);
            
        }catch(Exception e) {
        
           System.out.println("Generate Customer : Error while generating Customer data from csv file.") ;
        }
        Map<Integer,SalesPerson> salePerson = DataSource.getInstance().getSalePerson();
       if(salePerson.containsKey(order.getSupplierId())){
         salePerson.get(order.getSupplierId()).getOrders().add(order);  
          
       }else {
        SalesPerson sp = new SalesPerson(id);
        sp.getOrders().add(order);
        salePerson.put(id,sp);
       
       
       }
  }
     
       private void runAnalysis(){
       
       System.out.println("=============================================================\n");     
       helper.bestProduct();
       System.out.println("=============================================================\n"); 
       helper.bestCustomer();
       System.out.println("=============================================================\n"); 
       helper.bestSalesPerson();
       System.out.println("=============================================================\n"); 
       helper.totalRevenue();
           
           
       
       }

}
