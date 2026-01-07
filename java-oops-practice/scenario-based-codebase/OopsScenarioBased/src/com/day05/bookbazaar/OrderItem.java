package com.day05.bookbazaar;

public class OrderItem {
    private Book book;
    private int quantity;

    public OrderItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        double totalPrice = book.getPrice() * quantity;
        double discount = book.applyDiscount(quantity);
        return totalPrice - discount;
    }

    public boolean processItem() {
        return book.reduceStock(quantity);
    }
}

