package com.day04.petpal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp ");
    }

    @Override
    public void feed() {
        decreaseHunger(15);
        increaseMood(10);
    }

    @Override
    public void play() {
        increaseMood(10);
        decreaseEnergy(5);
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
    }
}
