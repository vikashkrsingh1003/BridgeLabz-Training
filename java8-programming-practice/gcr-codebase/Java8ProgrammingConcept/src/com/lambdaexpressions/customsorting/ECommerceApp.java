package com.lambdaexpressions.customsorting;

import java.util.*;

public class ECommerceApp {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 70000, 4.5, 10));
        products.add(new Product("Phone", 40000, 4.7, 15));
        products.add(new Product("Headphones", 3000, 4.2, 25));
        products.add(new Product("Smartwatch", 15000, 4.3, 20));

        System.out.println("---- Sort by Price - Low to High ----");
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        products.forEach(System.out::println);

        System.out.println("\n---- Sort by Rating - High to Low ----");
        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
        products.forEach(System.out::println);

        System.out.println("\n---- Sort by Discount - High to Low  ----");
        products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));
        products.forEach(System.out::println);
    }
}
