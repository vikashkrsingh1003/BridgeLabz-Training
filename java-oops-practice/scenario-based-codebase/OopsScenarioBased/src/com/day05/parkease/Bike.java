package com.day05.parkease;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateCharges(int hours) {
        double baseRate = 20;
        return (baseRate * hours) + (hours > 6 ? 50 : 0);
    }
}

