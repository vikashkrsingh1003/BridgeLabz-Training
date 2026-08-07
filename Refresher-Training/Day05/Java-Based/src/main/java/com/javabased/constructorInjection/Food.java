package com.javabased.constructorInjection;

public class Food {

    private String foodName;

    public Food(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return "Food : " + foodName;
    }
}