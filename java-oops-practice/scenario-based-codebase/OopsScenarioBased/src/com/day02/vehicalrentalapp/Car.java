package com.day02.vehicalrentalapp;

public class Car extends Vehicle {

    public Car(String vehicleId, String brand) {
        super(vehicleId, brand, 4000);
    }

    @Override
    public double calculateRent(int days) {
        double insuranceFee = 1500;
        return (baseRate * days) + insuranceFee;
    }
}
