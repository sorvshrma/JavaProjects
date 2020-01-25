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
public class Customer {
    
    private int id;
    private List<Order> order;

    public Customer(int id) {
        this.id = id;
        
        this.order = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }
    
     @Override
    public String toString() {
        return "Customer : " + "Id = " + id +  ", No. of Orders = " + order.size();
    }
    
    
    
}
