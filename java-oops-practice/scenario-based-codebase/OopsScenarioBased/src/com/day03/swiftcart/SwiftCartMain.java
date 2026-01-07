package com.day03.swiftcart;

import java.util.ArrayList;

public class SwiftCartMain {

    public static void main(String[] args) {

        // Create products
        Product milk = new PerishableProduct("Milk", 50);
        Product rice = new NonPerishableProduct("Rice", 60);

        // Create cart (empty constructor)
        Cart cart = new Cart();

        // Add products with quantity
        cart.addProduct(milk, 2);   // 50 * 2
        cart.addProduct(rice, 3);   // 60 * 3

        // Generate final bill
        cart.generateBill();
    }
}
