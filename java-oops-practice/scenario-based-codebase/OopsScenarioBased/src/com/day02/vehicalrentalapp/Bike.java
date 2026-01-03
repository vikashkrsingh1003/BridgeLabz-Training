package com.day02.vehicalrentalapp;

public class Bike extends Vehicle {

    public Bike(String vehicleId, String brand) {
        super(vehicleId, brand, 1000); // base rate per day
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }
}
