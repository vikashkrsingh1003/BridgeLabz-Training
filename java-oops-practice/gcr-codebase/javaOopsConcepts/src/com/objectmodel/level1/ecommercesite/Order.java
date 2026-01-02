package com.objectmodel.level1.ecommercesite;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Aggregation: Order contains Products
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getProductName() + " added to Order " + orderId);
    }

    public void showOrderDetails() {
        double total = 0;
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println("- " + p.getProductName() + " : $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total Amount: $" + total);
    }
}

