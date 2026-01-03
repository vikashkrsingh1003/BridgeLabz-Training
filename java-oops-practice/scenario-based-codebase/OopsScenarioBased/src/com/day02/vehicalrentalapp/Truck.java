package com.day02.vehicalrentalapp;

public class Truck extends Vehicle {

    public Truck(String vehicleId, String brand) {
        super(vehicleId, brand, 700);
    }

    @Override
    public double calculateRent(int days) {
        double heavyLoadSurcharge = 3000;
        return (baseRate * days) + heavyLoadSurcharge;
    }
}

