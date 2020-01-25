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
public class UpdateClass {

    private CreateClass create;
    private ViewClass view;
    private Product product;
    private Supplier supplier;

    public UpdateClass(Product product) {
        this.product = product;
        update();
    }

    private void update() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: " + product.getName());
        System.out.println("Press 'Y' if you want to update Name");
        String input1 = scanner.nextLine();
        if (input1.equals("Y") || input1.equals("y")) {
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            product.setName(name);

        }

        System.out.println();
        System.out.println("Price: " + product.getPrice());
        System.out.println("Press 'Y' if you want to update Price");
        String input2 = scanner.nextLine();
        if (input2.equals("Y") || input2.equals("y")) {
            System.out.print("Enter Price: ");
            try {
                double price = scanner.nextDouble();
                product.setPrice(price);
            } catch (InputMismatchException e) {
                System.out.println("Wrong data type entered, EXITING!!");
                return;
            } finally {
                scanner.nextLine();
            }

        }

        System.out.println();
        System.out.println("Availability: " + product.getAvailNum());
        System.out.println("Press 'Y' if you want to update Availability");
        String input3 = scanner.nextLine();
        if (input3.equals("Y") || input3.equals("y")) {
            System.out.print("Enter Availability: ");
            try {
                int avail = scanner.nextInt();
                product.setAvailNum(avail);
            } catch (InputMismatchException e) {
                System.out.println("Wrong data type entered, EXITING!!");
                return;
            } finally {
                scanner.nextLine();
            }

        }

        System.out.println();
        System.out.println("Description: " + product.getDescription());
        System.out.println("Press 'Y' if you want to update Description");
        String input4 = scanner.nextLine();
        if (input4.equals("Y") || input4.equals("y")) {
            System.out.print("Enter Description: ");
            String desc = scanner.nextLine();
            product.setDescription(desc);

        }

        supplier = product.getSupplier();

        System.out.println();
        System.out.println("Supplier Name: " + product.getSupplier().getSupplierName());
        System.out.println("Press 'Y' if you want to update Supplier Name");
        String input5 = scanner.nextLine();
        if (input5.equals("Y") || input5.equals("y")) {
            System.out.print("Enter Supplier Name: ");
            String sName = scanner.nextLine();
            supplier.setSupplierName(sName);

        }

        System.out.println();
        System.out.println("Supplier Address: " + product.getSupplier().getSupplierAddress());
        System.out.println("Press 'Y' if you want to update Supplier Address");
        String input6 = scanner.nextLine();
        if (input6.equals("Y") || input6.equals("y")) {
            System.out.print("Enter Supplier Address: ");
            String sAdd = scanner.nextLine();
            supplier.setSupplierAddress(sAdd);

        }

        product.setSupplier(supplier);

        System.out.println("--------------------------------------");
        System.out.println("\n" + "Updated Details" + "\n");
        view = new ViewClass(product);
    }

}
