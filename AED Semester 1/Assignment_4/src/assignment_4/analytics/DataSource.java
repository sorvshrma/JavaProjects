/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;
import assignment_4.entities.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author harry
 */
public class DataSource {
    
    private static DataSource dataStore;
    
    private Map<Integer, Customer> customer;
    private Map<Integer, Item> item;
    private Map<Integer, Order> order;
    private Map<Integer, Product> product;
    private Map<Integer, SalesPerson> salePerson;
    
    
    private DataSource(){
        customer = new HashMap<>();
        item = new HashMap<>();
        order = new HashMap<>();
        product = new HashMap<>();
        salePerson = new HashMap<>();
        
    }
    
    public static DataSource getInstance(){
        if(dataStore == null)
            dataStore = new DataSource();
        return dataStore;
    }

    public static DataSource getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataSource dataStore) {
        DataSource.dataStore = dataStore;
    }

    public Map<Integer, Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Map<Integer, Customer> customer) {
        this.customer = customer;
    }

    public Map<Integer, Item> getItem() {
        return item;
    }

    public void setItem(Map<Integer, Item> item) {
        this.item = item;
    }

    public Map<Integer, Order> getOrder() {
        return order;
    }

    public void setOrder(Map<Integer, Order> order) {
        this.order = order;
    }

    public Map<Integer, Product> getProduct() {
        return product;
    }

    public void setProduct(Map<Integer, Product> product) {
        this.product = product;
    }

    public Map<Integer, SalesPerson> getSalePerson() {
        return salePerson;
    }

    public void setSalePerson(Map<Integer, SalesPerson> salePerson) {
        this.salePerson = salePerson;
    }

       
}
