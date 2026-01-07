package com.day05.bookbazaar;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String userName;
    private List<OrderItem> items = new ArrayList<>();
    private String status;

    public Order(String userName) {
        this.userName = userName;
        this.status = "CREATED";
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getItemTotal();
        }
        return total;
    }

    public boolean placeOrder() {
        for (OrderItem item : items) {
            if (!item.processItem()) {
                return false;
            }
        }
        updateStatus("CONFIRMED");
        return true;
    }

    public String getStatus() {
        return status;
    }

    // Status update restricted to internal logic
    protected void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}

