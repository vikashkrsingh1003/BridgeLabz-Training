package com.day03.smartcheckout;

import java.util.*;

public class SmartCheckout {

    private Queue<Customer> customerQueue = new LinkedList<>();
    private HashMap<String, Double> priceMap = new HashMap<>();
    private HashMap<String, Integer> stockMap = new HashMap<>();

    // Initialize items, prices, and stock
    public SmartCheckout() {
        priceMap.put("Milk", 50.0);
        priceMap.put("Bread", 30.0);
        priceMap.put("Eggs", 6.0);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 15);
        stockMap.put("Eggs", 50);
    }

    // Add customer to queue
    public void addCustomer(Customer customer) {
        customerQueue.offer(customer);
        System.out.println(customer.name + " joined the checkout queue.");
    }

    // Remove & process customer from queue
    public void processCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        double totalBill = 0;

        for (String item : customer.items) {

            if (!priceMap.containsKey(item)) {
                System.out.println(item + " not found.");
                continue;
            }

            int stock = stockMap.get(item);

            if (stock <= 0) {
                System.out.println(item + " is out of stock.");
                continue;
            }

            totalBill += priceMap.get(item);
            stockMap.put(item, stock - 1);
        }

        System.out.println(customer.name + " bill amount: ₹" + totalBill);
    }

    // Display remaining stock
    public void displayStock() {
        System.out.println("Remaining Stock:");
        for (String item : stockMap.keySet()) {
            System.out.println(item + " : " + stockMap.get(item));
        }
    }
}
