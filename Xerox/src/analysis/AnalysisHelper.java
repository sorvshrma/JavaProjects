/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysis;

import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import static java.time.Clock.system;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Lionel
 */
public class AnalysisHelper {

    /**
     * Question 1
     */
    public void getTopThreeNegotiatedProducts() {

        Map<Integer, Product> productIdToProduct = DataStore.getInstance().getProductIdToProduct();
        Map<Integer, Order> orderIdToOrder = DataStore.getInstance().getOrderIdToOrder();
        Map<Integer, Integer> bestProductIdToQuantity = new HashMap<>();
        Map<Integer, Item> ItemtoItem = DataStore.getInstance().getItemIdToItem();
        
        List<Item> item = new ArrayList<>(ItemtoItem.values());

        List<Order> orders = new ArrayList<>(orderIdToOrder.values());
      
        if (orders != null && orders.size() > 0) {
            for (Order order : orders) {
                int quantity = 0;
                int productId = order.getItem().getProductId();

               if (productIdToProduct.containsKey(productId)) {
                    Product product = productIdToProduct.get(productId);
                    int targetPrice = product == null ? 0 : product.getTargetPrice();
                    double salesPrice = order.getItem().getSalesPrice();

                    if (salesPrice > targetPrice) {
                        quantity = order.getItem().getQuantity();
                    }
                    if (bestProductIdToQuantity.containsKey(productId)) {
                        quantity = quantity + bestProductIdToQuantity.get(productId);
                        bestProductIdToQuantity.put(productId, quantity);
                    } else {
                        bestProductIdToQuantity.put(productId, quantity);
                    }
               }

            }
        }

        
        Map<Integer, Integer> sortedMap = new HashMap<>();
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(bestProductIdToQuantity.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        System.out.println("Top 3 Negotitated Products : ");
//        for (int i = 0; i < 3; i++) {
//
//            System.out.println("Product: " + productIdToProduct.get(entries.get(i).getKey()) + " Quantity: " + entries.get(i).getValue());
//        }
//        
//        System.out.println("TESTTTTTTIIIINGGGGGG");
        int k=0;
        List<Map.Entry<Integer, Integer>> newEntries = new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            newEntries.add(entries.get(k));
            
            for(int j=k;j<entries.size();j++)
            {
                if(entries.get(j).getValue() == entries.get(j+1).getValue())
                {
                    newEntries.add(entries.get(j+1));
                    k=j+1;
                }
                
                else
                {
                 k=j+1;
                 
                 break;
                }
            }
                
        }
        
        for(int i=0; i<newEntries.size(); i++)
        {
             System.out.println("Product: " + productIdToProduct.get(entries.get(i).getKey()) + " Quantity: " + entries.get(i).getValue());
        }
       

    }
    /**
     * Question 2
     */
    public void getTopThreeBestCustomers() {
        Map<Integer, Customer> customerIdToCustomer = DataStore.getInstance().getCustomerIdToCustomer();
        Map<Integer, Product> productIdToProduct = DataStore.getInstance().getProductIdToProduct();
        Map<Integer, Order> orderIdToOrder = DataStore.getInstance().getOrderIdToOrder();
        Map<Integer, Double> customerIdToAbsoluteValue = new HashMap<>();

        int total = 0;

        for (Customer customer : customerIdToCustomer.values()) {
            double totalAbsoluteValue = 0;
            for (Order order : customer.getOrders()) {
                int productId = order.getItem().getProductId();
                Product product = productIdToProduct.get(productId);
                int targetPrice = product == null ? 0 : product.getTargetPrice();
                double salesPrice = order.getItem().getSalesPrice();
                if (customerIdToAbsoluteValue.containsKey(customer.getCustomerId())) {

                    totalAbsoluteValue = customerIdToAbsoluteValue.get(customer.getCustomerId());
                    totalAbsoluteValue += salesPrice - targetPrice;
                    customerIdToAbsoluteValue.put(customer.getCustomerId(), totalAbsoluteValue);
                } else {

                    totalAbsoluteValue = salesPrice - targetPrice;
                    customerIdToAbsoluteValue.put(customer.getCustomerId(), totalAbsoluteValue);
                }

            }

        }

        List<Map.Entry<Integer, Double>> entries = new ArrayList<>(customerIdToAbsoluteValue.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return (int) (o2.getValue() - o1.getValue());
            }
        });
 
        int k=0;
        List<Map.Entry<Integer, Double>> newEntries = new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            newEntries.add(entries.get(k));
            
            for(int j=k;j<entries.size();j++)
            {
                if(entries.get(j).getValue() == entries.get(j+1).getValue())
                {
                    newEntries.add(entries.get(j+1));
                    k=j+1;
                }
                
                else
                {
                 k=j+1;
                 
                 break;
                }
            }
                
        }
        
        for(int i=0; i<newEntries.size(); i++)
        {
             System.out.println("Top 3 Customers: " + (entries.get(i).getKey()) + " AbsoluteValue: " + entries.get(i).getValue());
        }

    }
     
    
    /**
     * Question 3
     */
    public void bestSalesPerson() {

        Map<Integer, Double> salesIdToProfit = new HashMap<Integer, Double>();

        Map<Integer, Product> productIdToProduct = DataStore.getInstance().getProductIdToProduct();

        Map<Integer, SalesPerson> salePersonIdToSalesPerson = DataStore.getInstance().getSalesPersonIdToSalesPerson();

        Map<Integer, Order> orderIdToOrder = DataStore.getInstance().getOrderIdToOrder();
        List<Order> orders = new ArrayList<>(orderIdToOrder.values());
        if (orders != null) {

            for (Order order : orders) {
                double profit = 0;
                int salesId = order.getSupplierId();
                int productId = order.getItem().getProductId();
                Product product = productIdToProduct.get(productId);
                int targetPrice = product.getTargetPrice();
                double salesPrice = order.getItem().getSalesPrice();
                int quantity = order.getItem().getQuantity();

                profit = (salesPrice - targetPrice) * quantity;

                if (salesIdToProfit.containsKey(salesId)) {
                    profit = profit + salesIdToProfit.get(salesId);
                    salesIdToProfit.put(salesId, profit);
                } else {
                    salesIdToProfit.put(salesId, profit);
                }

            }

        }
        List<Map.Entry<Integer, Double>> entries = new ArrayList<>(salesIdToProfit.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Integer, Double>>() {

            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return (int) (o2.getValue() - o1.getValue());

            }
        });
//        for (int i = 0; i < 3; i++) {
//
//            System.out.println("Sales Id : " + entries.get(i).getKey() + " Profit : " + entries.get(i).getValue());
//        }
//        
//         System.out.println("TESTTTTTTIIIINGGGGGG");
        int k=0;
        List<Map.Entry<Integer, Double>> newEntries = new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            newEntries.add(entries.get(k));
            
            for(int j=k;j<entries.size();j++)
            {
                if(entries.get(j).getValue() == entries.get(j+1).getValue())
                {
                    newEntries.add(entries.get(j+1));
                    k=j+1;
                }
                
                else
                {
                 k=j+1;
                 
                 break;
                }
            }
                
        }
        
        for(int i=0; i<newEntries.size(); i++)
        {
             System.out.println("Sales Id: " + (entries.get(i).getKey()) + " Profit: " + entries.get(i).getValue());
        }

    }
   
    /**
     * Question 4
     */
    public void getTotalProfit() {
        Map<Integer, Product> productIdToProduct = DataStore.getInstance().getProductIdToProduct();
        Map<Integer, Order> orderIdToOrder = DataStore.getInstance().getOrderIdToOrder();
        int profit = 0;

        List<Order> orders = new ArrayList<>(orderIdToOrder.values());

        if (orders != null) {
            for (Order order : orders) {
                Product product = productIdToProduct.get(order.getItem().getProductId());
                double salesPrice = order.getItem().getSalesPrice();
                int targetPrice = product.getTargetPrice();
                int quantity = order.getItem().getQuantity();

                profit += (targetPrice - salesPrice) * quantity;

            }

        }
        System.out.println("Total Revenue Above Target Price/ Total profit:" + profit);

    }

    /**
     * Question 5
     */
    public void getAveragePrice() {
        Map<Integer, Product> productIdToProduct = DataStore.getInstance().getProductIdToProduct();
        Map<Integer, Order> orderIdToOrder = DataStore.getInstance().getOrderIdToOrder();
        Map<Integer, Integer> productIdToSalesQuantity = new HashMap<>();
        Map<Integer, Double> productIdToTotalSalesPrice = new HashMap<>();
        Map<Integer, Double> productIdToAverageSalesPrice = new HashMap<>();
        List<Product> productsWithAverageSalesPricesAboveTarget = new ArrayList<>();
        List<Product> productsWithAverageSalesPricesBelowTarget = new ArrayList<>();

        List<Order> orders = new ArrayList<>(orderIdToOrder.values());
        List<Product> products = new ArrayList<>(productIdToProduct.values());
        if (orders != null) {
            for (Order order : orders) {
                int quantity = order.getItem().getQuantity();
                int productId = order.getItem().getProductId();
                double totalSalesPrice = order.getItem().getSalesPrice() * quantity;

                //populate sales quantity for each product
                if (productIdToSalesQuantity.containsKey(productId)) {
                    quantity += productIdToSalesQuantity.get(productId);
                }

                productIdToSalesQuantity.put(productId, quantity);

                //popuate total sales price for each product
                if (productIdToTotalSalesPrice.containsKey(productId)) {
                    totalSalesPrice += productIdToTotalSalesPrice.get(productId);
                }

                productIdToTotalSalesPrice.put(productId, totalSalesPrice);

            }

            System.out.println("Product Id,            Average Sales Price,            Target Price,          Difference Between Average Sales Price and Target Price,              Error%");
            for (Product product : products) {
                double averageSalesPrice = 0;
                double targetPrice = 0;
                // double newTaregetPrice;
                double errorPercentage = 0;
                int productId = product.getProductId();
                if (productIdToSalesQuantity.containsKey(productId) && productIdToTotalSalesPrice.containsKey(productId)) {
                    targetPrice = product.getTargetPrice();
                    averageSalesPrice = productIdToTotalSalesPrice.get(productId) / productIdToSalesQuantity.get(productId);
                    product.setAverageSalesPrice(averageSalesPrice);
                    product.setDiffTargetAvgSales(averageSalesPrice - targetPrice);
                    productIdToAverageSalesPrice.put(productId, averageSalesPrice);
                    errorPercentage = ((averageSalesPrice - targetPrice) * 100 / averageSalesPrice);
                }
                System.out.println(product.getProductId() + "                     " + averageSalesPrice + "                    " + targetPrice + "                     " + (averageSalesPrice - targetPrice) + "        " + errorPercentage + "%");

                // modifyTarget(product);
            }

           // List<Double> allAverageSalesPrices = new ArrayList<>(productIdToAverageSalesPrice.values());
            for (Product product : products) {
                double targetPrice = product.getTargetPrice();
                double salesPrice = product.getAverageSalesPrice();
                if (salesPrice >= targetPrice) {
                    productsWithAverageSalesPricesAboveTarget.add(product);
                } else {
                    productsWithAverageSalesPricesBelowTarget.add(product);
                }

            }

            Collections.sort(productsWithAverageSalesPricesAboveTarget, new Comparator<Product>() {
                @Override
                public int compare(Product p1, Product p2) {
                    return (int) (p2.getDiffTargetAvgSales() - p1.getDiffTargetAvgSales());
                }
            });

            Collections.sort(productsWithAverageSalesPricesBelowTarget, new Comparator<Product>() {
                @Override
                public int compare(Product p1, Product p2) {
                    return (int) (p2.getDiffTargetAvgSales() - p1.getDiffTargetAvgSales());
                }
            });

            System.out.println("Average sale price Above than the target price---------------");
            for (Product product : productsWithAverageSalesPricesAboveTarget) {
                double error = (product.getAverageSalesPrice() - product.getTargetPrice()) == 0 ? 0 : ((product.getAverageSalesPrice() - product.getTargetPrice()) * 100) / product.getAverageSalesPrice();
                System.out.println("ProductId: " + product.getProductId() + "        Average Sales Price: " + product.getAverageSalesPrice() + "       Product Target Price: " + product.getTargetPrice() + "        Average SalesPrice-Target Price: " + product.getDiffTargetAvgSales() + "        Error percentage: " + error + "%");

            }
            System.out.println("___________________________________________");
            System.out.println("Average sale price Below than the target price---------------");
            for (Product product : productsWithAverageSalesPricesBelowTarget) {
                double error = (product.getAverageSalesPrice() - product.getTargetPrice()) == 0 ? 0 : ((product.getAverageSalesPrice() - product.getTargetPrice()) * 100) / product.getAverageSalesPrice();
                System.out.println("ProductId: " + product.getProductId() + "        Average Sales Price:" + product.getAverageSalesPrice() + "         Product  Target Price: " + product.getTargetPrice() + "           Average SalesPrice - Target Price: " + product.getDiffTargetAvgSales() + "         Error percentage: " + error + "%");

            }

        }

    }

    public void updateTargetPrice() {
        Map<Integer, Product> productIdToProduct = DataStore.getInstance().getProductIdToProduct();
        List<Product> products = new ArrayList<>(productIdToProduct.values());
        List<Product> productsWithAverageSalesPricesAboveTarget = new ArrayList<>();
        List<Product> productsWithAverageSalesPricesBelowTarget = new ArrayList<>();

        System.out.println("Product Id,       Average Sales Price,        New Target Price,         Difference Between Average Sales Price and New Target Price,        Error%");

        for (Product product : products) {
            double averageSalesPrice = product.getAverageSalesPrice();
            int targetPrice = product.getTargetPrice();
            double newTargetPrice = 0;
            double errorPercentage = 0;

            if (0.95 * (averageSalesPrice) < targetPrice && targetPrice < 1.05 * (averageSalesPrice)) {
                newTargetPrice = targetPrice;
            } else {
                if (targetPrice > averageSalesPrice) {
                    newTargetPrice = 1.04 * (averageSalesPrice);
                } else {
                    newTargetPrice = 0.96 * (averageSalesPrice);
                }

            }
            errorPercentage = averageSalesPrice - newTargetPrice == 0 ? 0 : ((averageSalesPrice - newTargetPrice) * 100 / averageSalesPrice);
            product.setNewTargetPrice(newTargetPrice);
            product.setDiffTargetAvgSales(averageSalesPrice - targetPrice);

            System.out.println(product.getProductId() + "                                   " + averageSalesPrice + "                              " + newTargetPrice + "                                      " + (averageSalesPrice - newTargetPrice) + "                        " + errorPercentage + "%");
        }

        for (Product product : products) {
            double newTargetPrice = product.getNewTargetPrice();
            double salesPrice = product.getAverageSalesPrice();
            if (salesPrice >= newTargetPrice) {
                productsWithAverageSalesPricesAboveTarget.add(product);
            } else {
                productsWithAverageSalesPricesBelowTarget.add(product);
            }

        }

        Collections.sort(productsWithAverageSalesPricesAboveTarget, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return (int) (p2.getDiffTargetAvgSales() - p1.getDiffTargetAvgSales());
            }
        });

        Collections.sort(productsWithAverageSalesPricesBelowTarget, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return (int) (p2.getDiffTargetAvgSales() - p1.getDiffTargetAvgSales());
            }
        });

        System.out.println("Average sale price Above than the New target price--------------- ");
        for (Product product : productsWithAverageSalesPricesAboveTarget) {
            double error = (product.getAverageSalesPrice() - product.getNewTargetPrice()) == 0 ? 0 : ((product.getAverageSalesPrice() - product.getNewTargetPrice()) * 100) / product.getAverageSalesPrice();
            System.out.println("ProductId: " + product.getProductId() + "       Average Sales Price: " + product.getAverageSalesPrice() + "        Product New Target Price: " + product.getNewTargetPrice() + "          Average SalesPrice - New Target Price: " + product.getDiffTargetAvgSales() + "          Error percentage: " + error + "%");

        }
        System.out.println("___________________________________________");
        System.out.println("Average sale price lower than the New target price------------ ");
        for (Product product : productsWithAverageSalesPricesBelowTarget) {
            double error = (product.getAverageSalesPrice() - product.getNewTargetPrice()) == 0 ? 0 : ((product.getAverageSalesPrice() - product.getNewTargetPrice()) * 100) / product.getAverageSalesPrice();
            System.out.println("ProductId: " + product.getProductId() + "           Average Sales Price: " + product.getAverageSalesPrice() + "        Product New Target Price: " + product.getNewTargetPrice() + "           Average SalesPrice - New Target Price: " + product.getDiffTargetAvgSales() + "           Error percentage: " + error + "%");
        }
    }
}
