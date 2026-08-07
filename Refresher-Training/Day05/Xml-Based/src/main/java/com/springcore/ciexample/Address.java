package com.springcore.ciexample;

public class Address {

     String city;

    public Address(String city) {
        this.city = city;
    }

    public void display() {
        System.out.println(city);
    }
}