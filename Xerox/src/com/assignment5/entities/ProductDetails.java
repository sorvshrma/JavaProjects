/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

/**
 *
 * @author ankit
 */
public class ProductDetails {

    int productId;
    int targetPrice;
    int averageSalesPrice;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public double getAverageSalesPrice() {
        return averageSalesPrice;
    }

    public void setAverageSalesPrice(int averageSalesPrice) {
        this.averageSalesPrice = averageSalesPrice;
    }

    @Override
    public String toString() {
       return "";
    }

   

}
