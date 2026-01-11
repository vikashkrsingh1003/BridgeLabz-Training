package com.day06.medistore;

import java.time.LocalDate;

public abstract class Medicine implements Isellable {

    private String name;
    private double price;          
    private int quantity;           
    protected LocalDate expiryDate; //accessible to subclasses

   
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 100); 
    }

    
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Sell medicine (stock adjustment + total price)
    @Override
    public double sell(int qty) {
        if (qty <= 0 || qty > quantity) {
            throw new IllegalArgumentException("Invalid quantity");
        }
        quantity -= qty;
        return calculateTotalPrice(qty);
    }

    // Operator-like behavior (total price)
    protected double calculateTotalPrice(int qty) {
        return price * qty;
    }

    // Discount operator
    public double applyDiscount(int qty, double discountPercent) {
        double total = calculateTotalPrice(qty);
        return total - (total * discountPercent / 100);
    }

    // Stock operator
    public void addStock(int qty) {
        quantity += qty;
    }

    // Encapsulation (read-only access)
    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    // Sensitive pricing logic hidden
    private double getCostPrice() {
        return price * 0.6;
    }
}
