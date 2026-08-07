package com.springcore.setterInjection;

public class Address {

    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "City = " + city + ", State = " + state;
    }
}