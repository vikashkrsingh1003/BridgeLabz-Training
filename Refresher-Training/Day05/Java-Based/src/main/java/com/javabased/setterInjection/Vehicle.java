package com.javabased.setterInjection;


public class Vehicle {

    private String name;
    private Engine engine;

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void display() {
        System.out.println("Vehicle : " + name);
        System.out.println(engine);
    }
}