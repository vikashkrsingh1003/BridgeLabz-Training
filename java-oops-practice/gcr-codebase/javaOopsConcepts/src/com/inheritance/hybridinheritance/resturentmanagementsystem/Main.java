package com.inheritance.hybridinheritance.resturentmanagementsystem;

public class Main {
    public static void main(String[] args) {

        Worker chef = new Chef("Gordon", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Alice", 102, 5);

        System.out.println("=== Chef Info ===");
        ((Chef) chef).displayInfo();
        chef.performDuties();

        System.out.println("\n=== Waiter Info ===");
        ((Waiter) waiter).displayInfo();
        waiter.performDuties();
    }
}

