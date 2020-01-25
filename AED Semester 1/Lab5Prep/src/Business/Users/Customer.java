/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import java.util.Date;

/**
 *
 * @author harshalneelkamal
 */
public class Customer extends User implements Comparable<Customer> {
    
    private Date date;
    
    public Customer(Date date, String password, String userName) {
        super(password, userName, "CUSTOMER");
        this.date = date;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int compareTo(Customer c) {
        return c.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean verify(String password){
        return password.equals(getPassword());
    }
}
