/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Business.Product;
import Business.Supplier;

/**
 *
 * @author harry
 */
public class ViewClass {
    
    private Product product;
    private Supplier supplier;
    
    public ViewClass(Product product){
        this.product = product;
        getData();
    }
    
    private void getData(){
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Availability Number: " + product.getAvailNum());
        System.out.println("Product Description: " + product.getDescription());
        
        supplier = product.getSupplier();
        System.out.println("Supplier Name: " + supplier.getSupplierName());
        System.out.println("Supplier Address: " + supplier.getSupplierAddress());
        System.out.println("--------------------------------------");
    }
    
}
