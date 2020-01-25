/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Business.Product;
import java.util.Scanner;


/**
 *
 * @author harry
 */
public class MainClass {
    
    private Product product;
    
    public MainClass(){
        product = new Product();
        System.out.println("Create your Product" + "\n");
        CreateClass createClass = new CreateClass(product);
        
        System.out.println("\n" + "View your Product" + "\n");
        ViewClass viewClass = new ViewClass(product);
        
        System.out.println("\n" + "Hit 'Y' to update your product else Hit 'N'");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("--------------------------------------");
        
        if (input.equals("Y") || input.equals("y")){
            System.out.println("\n" + "Update your Product" + "\n");
            UpdateClass updateClass = new UpdateClass(product);
            System.out.println("\n" + "******THANK YOU!!******");
        }
        else
            System.out.println("\n" + "*****THANK YOU!!*****");
    }
    
    public static void main(String[] args){
        MainClass obj = new MainClass();
    }
    
}
