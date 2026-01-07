package com.day05.bookbazaar;

import java.util.Scanner;

public class BookBazaarApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String userName = sc.nextLine();

        Order order = new Order(userName);

        System.out.print("How many books do you want to order? ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {

            sc.nextLine(); 
            System.out.println("\nBook " + i);

            System.out.print("Enter Book Type (ebook/printed): ");
            String type = sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            Book book;

            if (type.equalsIgnoreCase("ebook")) {
                book = new EBook(title, author, price);
            } else {
                System.out.print("Enter Stock Available: ");
                int stock = sc.nextInt();
                book = new PrintedBook(title, author, price, stock);
            }

            OrderItem item = new OrderItem(book, quantity);
            order.addItem(item);
        }

        if (order.placeOrder()) {
            System.out.println("\nOrder Placed Successfully!");
            System.out.println("Total Amount: " + order.calculateTotal());
            System.out.println("Order Status: " + order.getStatus());
        } else {
            System.out.println("\nOrder Failed due to insufficient stock.");
        }

        sc.close();
    }
}
