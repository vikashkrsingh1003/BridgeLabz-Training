package com.javabased.setterInjection;

public class Engine {

    private String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine Type : " + type;
    }
}