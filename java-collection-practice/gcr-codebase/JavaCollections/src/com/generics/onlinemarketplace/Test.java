package com.generics.onlinemarketplace;

public class Test {

    public static void main(String[] args) {

        Category bookCategory = new Category("Books", 100, 1000) {};
        Category gadgetCategory = new Category("Gadgets", 500, 5000) {};

        Product<Category> book =
                new Product<>("Java Programming", 600, bookCategory);

        Product<Category> gadget =
                new Product<>("Smart Watch", 3000, gadgetCategory);

        DiscountService.applyDiscount(book, 10);
        DiscountService.applyDiscount(gadget, 20);

        System.out.println(book.getName() + " Final Price: " + book.getPrice());
        System.out.println(gadget.getName() + " Final Price: " + gadget.getPrice());
    }
}
