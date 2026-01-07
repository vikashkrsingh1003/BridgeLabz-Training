package com.day03.swiftcart;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
    }

    public Cart(ArrayList<Product> items) {
        this.products = items;
        calculateTotal();
    }

    public void addProduct(Product p, int quantity) {
        products.add(p);
        totalPrice += p.price * quantity; // operator usage
    }

    private void calculateTotal() {
        for (Product p : products) {
            totalPrice += p.price;
        }
    }

    @Override
    public void applyDiscount() {
        for (Product p : products) {
            totalPrice = p.applyDiscount(totalPrice); // polymorphism
        }
    }

    @Override
    public void generateBill() {
        applyDiscount();
        System.out.println("Final Bill Amount: ₹" + totalPrice);
    }
}

