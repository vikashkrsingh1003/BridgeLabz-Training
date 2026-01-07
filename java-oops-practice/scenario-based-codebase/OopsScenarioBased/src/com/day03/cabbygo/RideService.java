package com.day03.cabbygo;

public class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(double distance) {
        vehicle.calculateFare(distance);
        System.out.println("Ride booked with " + vehicle.type);
        System.out.println("Driver: " + driver.name);
        System.out.println("Fare: ₹" + vehicle.getFare());
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended successfully.");
    }
}

