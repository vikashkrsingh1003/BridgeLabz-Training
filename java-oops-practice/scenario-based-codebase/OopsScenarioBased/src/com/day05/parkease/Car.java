package com.day05.parkease;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateCharges(int hours) {
        double baseRate = 50;
        return (baseRate * hours) + (hours > 5 ? 100 : 0);
    }
}

