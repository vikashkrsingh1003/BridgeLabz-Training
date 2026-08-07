package com.javabased.constructorInjection;

public class Animal {

    private String name;
    private Food food;

    public Animal(String name, Food food) {
        this.name = name;
        this.food = food;
    }

    public void display() {
        System.out.println("Animal : " + name);
        System.out.println(food);
    }
}