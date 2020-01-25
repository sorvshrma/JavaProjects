/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author harry
 */
public class CustomerDirectory {
    
    private ArrayList<CustomerDetails> customer;
    
    public CustomerDirectory(){
        customer = new ArrayList<CustomerDetails>();
    }

    public ArrayList<CustomerDetails> getCustomer() {
        return customer;
    }
    
    public CustomerDetails addCustomer(){
        CustomerDetails a = new CustomerDetails();
        customer.add(a);
        return a;
    }
    
    public void removeCustomer(CustomerDetails a){
        customer.remove(a);
    }
}
