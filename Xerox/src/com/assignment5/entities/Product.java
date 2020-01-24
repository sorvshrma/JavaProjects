/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

/**
 *
 * @author Ankit Patro
 */
public class Product {

    private int productId;
    private int minPrice;
    private int maxPrice;
    private int targetPrice;
    private double averageSalesPrice;
    private double newTargetPrice;
    private double diffTargetAvgSales;

    public double getNewTargetPrice() {
        return newTargetPrice;
    }

    public void setNewTargetPrice(double newTargetPrice) {
        this.newTargetPrice = newTargetPrice;
    }
    
    

    public double getAverageSalesPrice() {
        return averageSalesPrice;
    }

    public void setAverageSalesPrice(double averageSalesPrice) {
        this.averageSalesPrice = averageSalesPrice;
    }
    
    

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.productId;
        hash = 83 * hash + this.minPrice;
        hash = 83 * hash + this.maxPrice;
        hash = 83 * hash + this.targetPrice;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.productId != other.productId) {
            return false;
        }
        if (this.minPrice != other.minPrice) {
            return false;
        }
        if (this.maxPrice != other.maxPrice) {
            return false;
        }
        if (this.targetPrice != other.targetPrice) {
            return false;
        }
        return true;
    }

    public double getDiffTargetAvgSales() {
        return diffTargetAvgSales;
    }

    public void setDiffTargetAvgSales(double diffTargetAvgSales) {
        this.diffTargetAvgSales = diffTargetAvgSales;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", minPrice=" + minPrice + ", maxPrice=" + maxPrice + ", targetPrice=" + targetPrice + ", averageSalesPrice=" + averageSalesPrice + ", diffTargetAvgSales=" + diffTargetAvgSales + '}';
    }

    

   
}
