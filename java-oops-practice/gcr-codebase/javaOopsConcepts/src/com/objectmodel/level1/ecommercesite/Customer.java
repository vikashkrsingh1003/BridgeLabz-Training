package com.objectmodel.level1.ecommercesite;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private List<Order> orders;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Communication between Customer and Order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order " + order);
    }
}

