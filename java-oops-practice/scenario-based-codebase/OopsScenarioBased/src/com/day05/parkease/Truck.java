package com.day05.parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateCharges(int hours) {
        double baseRate = 100;
        return (baseRate * hours) + (hours > 4 ? 200 : 0);
    }
}

