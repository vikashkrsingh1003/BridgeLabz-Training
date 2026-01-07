package com.day03.cabbygo;

public class Vehicle {

    public String vehicleNumber;
    public int capacity;
    public String type;

    private double fare;        // sensitive data
    private double ratePerKm;

    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    protected void calculateFare(double distance) {
        double baseFare = 50;
        fare = baseFare + distance * ratePerKm;   // operators
    }

    public double getFare() {
        return fare;
    }
}

