/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import analysis.AnalysisHelper;
import analysis.DataStore;
import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author kasai
 */
public class GateWay {

    AnalysisHelper helper = new AnalysisHelper();

    public static void main(String args[]) throws IOException {

        DataGenerator generator = DataGenerator.getInstance();

        //Below is the sample for how you can use reader. you might wanna 
        //delete it once you understood.
        DataReader orderReader = new DataReader(generator.getOrderFilePath());
        String[] orderRow;

        //      printRow(orderReader.getFileHeader());
        while ((orderRow = orderReader.getNextRow()) != null) {

            //generateItem(orderRow);
            Item item = generateItem(orderRow);

            //generate Order
            Order order = generateOrder(orderRow, item);

            //generateCustomer
            generateCustomer(orderRow, order);

            //generate SalesPerson
            generateSalesPerson(orderRow, order);

            printRow(orderRow);
        }
        //System.out.println("_____________________________________________________________");
        DataReader productReader = new DataReader(generator.getProductCataloguePath());
        String[] prodRow;
        // printRow(productReader.getFileHeader());
        while ((prodRow = productReader.getNextRow()) != null) {

            //generateProduct
            generateProduct(prodRow);
            printRow(prodRow);
        }

      //  System.out.println("ORDERRRRSSSS" + DataStore.getInstance().getProductIdToProduct());
        GateWay gateWay = new GateWay();
        gateWay.runAnalysis();
    }

    public static void printRow(String[] row) {
        for (String row1 : row) {
           // System.out.print(row1 + ", ");
        }
        //System.out.println("");
    }

    /**
     * Generate Order
     *
     * @param orderRow
     * @param item
     */
    private static Order generateOrder(String[] orderRow, Item item) {

        int orderId = Integer.parseInt(orderRow[0]);
        int supplierId = Integer.parseInt(orderRow[4]);
        int customerId = Integer.parseInt(orderRow[5]);

        Order order = new Order(orderId, supplierId, customerId, item);
        DataStore.getInstance().getOrderIdToOrder().put(orderId, order);

        return order;

    }

    private static void generateCustomer(String[] row, Order order) {

        int id = 0;
        try {
            id = Integer.parseInt(row[5]);

        } catch (Exception e) {

         //   System.out.println("Generate Customer : Error while generating Customer data from csv file.");
        }
        Map<Integer, Customer> customerIdToCustomer = DataStore.getInstance().getCustomerIdToCustomer();
        if (customerIdToCustomer.containsKey(order.getCustomerId())) {
            customerIdToCustomer.get(order.getCustomerId()).getOrders().add(order);

        } else {
            Customer customer = new Customer(id);
            customer.getOrders().add(order);
            customerIdToCustomer.put(id, customer);

        }
    }

    private static void generateProduct(String[] prodRow) {

        Product product = new Product();
        int productId = Integer.parseInt(prodRow[0]);
        product.setProductId(productId);
        product.setMinPrice(Integer.parseInt(prodRow[1]));
        product.setMaxPrice(Integer.parseInt(prodRow[2]));
        product.setTargetPrice(Integer.parseInt(prodRow[3]));
        DataStore.getInstance().getProductIdToProduct().put(productId, product);
        // System.out.println("Product+++++++++++++++++++++++++++++++++" + DataStore.getInstance().getProductIdToProduct());
    }

    private static Item generateItem(String[] orderRow) {
        int itemId = Integer.parseInt(orderRow[1]);
        Item item = new Item(itemId, Integer.parseInt(orderRow[2]), Double.parseDouble(orderRow[6]), Integer.parseInt(orderRow[3]));
        DataStore.getInstance().getItemIdToItem().put(itemId, item);
        return item;
        //  System.out.println("Itemmmmmmmm++++++++++++++++++++" + DataStore.getInstance().getItemIdToItem());
    }

    /**
     * Generate Sales Person
     *
     * @param orderRow
     * @param order
     */
    private static void generateSalesPerson(String[] orderRow, Order order) {
        int id = 0;
        try {
            id = Integer.parseInt(orderRow[4]);

        } catch (Exception e) {

           // System.out.println("Generate Customer : Error while generating Customer data from csv file.");
        }
        Map<Integer, SalesPerson> salesIdToSalesPerson = DataStore.getInstance().getSalesPersonIdToSalesPerson();
        if (salesIdToSalesPerson.containsKey(order.getSupplierId())) {
            salesIdToSalesPerson.get(order.getSupplierId()).getOrders().add(order);

        } else {
            SalesPerson salesPerson = new SalesPerson(id);
            salesPerson.getOrders().add(order);
            salesIdToSalesPerson.put(id, salesPerson);

        }
    }

    private void runAnalysis() {

  
        System.out.println("Question 1=============================================================\n");
        helper.getTopThreeNegotiatedProducts();
        System.out.println("Question 2=============================================================\n");
        helper.getTopThreeBestCustomers();
        System.out.println("Question 3=============================================================\n");
        helper.bestSalesPerson();
        System.out.println("Question 4=============================================================\n");
        helper.getTotalProfit();
        System.out.println("Question 5=============================================================\n");
        System.out.println("Original Data=============================================================\n");
        helper.getAveragePrice();
        System.out.println("Modified Data=============================================================\n");
        helper.updateTargetPrice();

    }

}
