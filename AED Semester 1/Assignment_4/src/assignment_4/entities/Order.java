/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class Order {

    int orderId;
    int supplierId;
    int customerId;
    private List<Item> item;

    public Order(int orderId, int supplierId, int customerId) {
        this.orderId = orderId;
        this.supplierId = supplierId;
        this.customerId = customerId;
        this.item = new ArrayList<>();

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public int getAllOrdersTotal(List<Item> item, List<Product> p) {
        int sum = 0;
        for (int i = 0; i < item.size(); i++) {

            sum = sum + item.get(i).getOrderTotal(p);

        }
        return sum;
    }

    @Override
    public String toString() {
        return "Order{" + "id = " + orderId + ", SupplierId = " + supplierId + ", CustomerId = " + customerId + ", ItemListSize = " + item.size() + '}';
    }

}
