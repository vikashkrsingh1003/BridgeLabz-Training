package com.day05.bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public double applyDiscount(int quantity) {
        // Flat 20% discount for ebooks
        return price * quantity * 0.20;
    }
}
