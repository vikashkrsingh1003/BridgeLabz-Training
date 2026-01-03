package com.day02.vehicalrentalapp;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
    	System.out.println("--------------------------");
        System.out.println(name + " rented a " + vehicle.getBrand());
        System.out.println("Total Rent: Rs : " + vehicle.calculateRent(days));
        System.out.println("--------------------------");
    }
}
