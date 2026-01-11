package com.day06.medistore;

import java.time.LocalDate;
import java.util.Scanner;

public class MediStoreApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Medicine medicine = null;

        System.out.println("Enter Medicine Type (1-Tablet, 2-Syrup, 3-Injection): ");
        int type = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        String dateInput = sc.next();
        LocalDate expiryDate = LocalDate.parse(dateInput);

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

   
        switch (type) {
            case 1:
                medicine = new Tablet(name, price, expiryDate);
                break;
            case 2:
                medicine = new Syrup(name, price, expiryDate);
                break;
            case 3:
                medicine = new Injection(name, price, expiryDate);
                break;
            default:
                System.out.println("Invalid medicine type");
                System.exit(0);
        }

        // Add stock from user input
        medicine.addStock(quantity - medicine.getQuantity());

        // Check expiry (Polymorphism)
        System.out.println("Is medicine expired? " + !medicine.checkExpiry());

        // Selling
        System.out.print("Enter quantity to sell: ");
        int sellQty = sc.nextInt();

        try {
            double totalPrice = medicine.sell(sellQty);
            System.out.println("Total Price: " + totalPrice);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
