package com.javabased.feildInjection;

public class Address {

    private String city = "Hyderabad";
    private String state = "Telangana";

    @Override
    public String toString() {
        return "Address [city=" + city + ", state=" + state + "]";
    }
}