package com.day03.cabbygo;

public class Driver {

    public String name;
    public String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }
}

