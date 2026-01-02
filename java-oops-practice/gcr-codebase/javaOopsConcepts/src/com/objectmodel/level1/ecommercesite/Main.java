package com.objectmodel.level1.ecommercesite;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Alice");

        Product p1 = new Product(1, "Laptop", 800.0);
        Product p2 = new Product(2, "Mouse", 20.0);
        Product p3 = new Product(3, "Keyboard", 40.0);

        Order order1 = new Order(5001);

        customer.placeOrder(order1);

        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        order1.showOrderDetails();
    }
}

