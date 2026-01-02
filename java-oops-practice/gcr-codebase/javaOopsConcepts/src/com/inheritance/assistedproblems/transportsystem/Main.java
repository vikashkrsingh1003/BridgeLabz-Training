package com.inheritance.assistedproblems.transportsystem;


public class Main {
    public static void main(String[] args) {

        // Array of Vehicle type (polymorphism)
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        // Dynamic method calls
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}

