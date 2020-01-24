/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kasai
 */
    public class Order {

    int orderId;
    int supplierId;
    int customerId;
    //Item item;
    private Item item;

    public Order(int orderId, int supplierId, int customerId, Item item) {
        this.orderId = orderId;
        this.supplierId = supplierId;
        this.customerId = customerId;
        this.item = item;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", supplierId=" + supplierId + ", customerId=" + customerId + ", item=" + item + '}';
    }

   

}
