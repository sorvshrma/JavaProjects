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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ankit
 */
public class DataStore {

    private static DataStore dataStore;

    private Map<Integer, Product> productIdToProduct;
    private Map<Integer, Item> itemIdToItem;
    private Map<Integer, Customer> customerIdToCustomer;
    private Map<Integer, Order> orderIdToOrder;
    private Map<Integer, SalesPerson> salePerson;

    private DataStore() {
        productIdToProduct = new HashMap<>();
        itemIdToItem = new HashMap<>();
        orderIdToOrder = new HashMap<>();
        customerIdToCustomer = new HashMap<>();
        salePerson = new HashMap<>();

    }

    public static DataStore getInstance() {
        if (dataStore == null) {
            dataStore = new DataStore();
        }
        return dataStore;
    }

    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public Map<Integer, Product> getProductIdToProduct() {
        return productIdToProduct;
    }

    public void setProductIdToProduct(Map<Integer, Product> productIdToProduct) {
        this.productIdToProduct = productIdToProduct;
    }

    public Map<Integer, Item> getItemIdToItem() {
        return itemIdToItem;
    }

    public void setItemIdToItem(Map<Integer, Item> itemIdToItem) {
        this.itemIdToItem = itemIdToItem;
    }

    public Map<Integer, Customer> getCustomerIdToCustomer() {
        return customerIdToCustomer;
    }

    public void setCustomerIdToCustomer(Map<Integer, Customer> customer) {
        this.customerIdToCustomer = customer;
    }

    public Map<Integer, Order> getOrderIdToOrder() {
        return orderIdToOrder;
    }

    public void setOrderIdToOrder(Map<Integer, Order> order) {
        this.orderIdToOrder = order;
    }

    public Map<Integer, SalesPerson> getSalesPersonIdToSalesPerson() {
        return salePerson;
    }

    public void setSalePerson(Map<Integer, SalesPerson> salePerson) {
        this.salePerson = salePerson;
    }

}
