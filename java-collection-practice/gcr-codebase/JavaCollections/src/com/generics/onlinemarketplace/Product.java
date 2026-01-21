package com.generics.onlinemarketplace;

public class Product<T extends Category> {

    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {

        if (!category.isValidPrice(price)) {
            throw new IllegalArgumentException("Price not valid for category");
        }

        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }
}
