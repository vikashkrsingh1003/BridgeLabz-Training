package com.day03.smartcheckout;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        Customer c1 = new Customer("Shubham",
                Arrays.asList("Milk", "Bread"));

        Customer c2 = new Customer("Vinay",
                Arrays.asList("Eggs", "Milk", "Milk"));

        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        checkout.processCustomer();
        checkout.processCustomer();

        checkout.displayStock();
    }
}
