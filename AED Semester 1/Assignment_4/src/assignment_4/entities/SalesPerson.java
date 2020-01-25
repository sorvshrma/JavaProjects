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
public class SalesPerson {
    int sales_id;
    private List<Order> orders;
    
    public SalesPerson(int sales_id) {
        this.sales_id = sales_id;
        this.orders = new ArrayList<>();
    }
    
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
    public int getSales_id() {
        return sales_id;
    }

    public void setSales_id(int sales_id) {
        this.sales_id = sales_id;
    }
    
     @Override
    public String toString() {
        return "SalesPerson : " + "Id = " +  sales_id + ", No. of Order = " + orders.size();
    }
    
}
