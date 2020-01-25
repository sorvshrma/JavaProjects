/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

/**
 *
 * @author harshalneelkamal
 */
public class Product {
    
    private int productId ; 
    private int  minPrice; 
    private int maxPrice ; 
    private int targetPrice;

    public Product(int id , int minPrice , int maxPrice , int targetPrice )
    {
        this.productId =  id;
        this.minPrice = minPrice ;
        this.maxPrice = maxPrice ;
        this.targetPrice = targetPrice ;
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
    public String toString() {
        return "Product : " + "Id = " +  productId + ", MinPrice = " + minPrice + ", MaxPrice = " + maxPrice + ", TargetPrice = " + targetPrice;
    
    }
    
    
   
    
    
}
