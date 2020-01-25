/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Business.Product;
import Business.Supplier;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author harry
 */
public class CreateClass {

    private Product product;
    private Supplier supplier;

    public CreateClass(Product product) {
        this.product = product;
        supplier = new Supplier();
        setData();
    }

    private void setData() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        product.setName(name);

        System.out.print("Price: ");
        try {
            double price = scanner.nextDouble();
            product.setPrice(price);
        } catch (InputMismatchException e) {
            System.out.println("Wrong data type entered, EXITING!!");
            return;
        } finally {
            scanner.nextLine();
        }

        System.out.print("Availability Number: ");
        try {
            int count = scanner.nextInt();
            product.setAvailNum(count);
        } catch (InputMismatchException e) {
            System.out.println("Wrong data type entered, EXITING!!");
            return;
        } finally {
            scanner.nextLine();
        }

        System.out.print("Description: ");
        String desc = scanner.nextLine();
        product.setDescription(desc);

        System.out.print("Supplier Name: ");
        String sName = scanner.nextLine();
        supplier.setSupplierName(sName);

        System.out.print("Supplier Address: ");
        String sAdd = scanner.nextLine();
        supplier.setSupplierAddress(sAdd);
        product.setSupplier(supplier);

        System.out.println("--------------------------------------");

    }

}
