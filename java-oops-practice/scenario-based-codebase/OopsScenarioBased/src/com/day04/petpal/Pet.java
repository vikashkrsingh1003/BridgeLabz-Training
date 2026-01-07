package com.day04.petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated fields
    private int hunger; // 0 (full) - 100 (starving)
    private int mood;   // 0 (sad) - 100 (happy)
    private int energy; // 0 (tired) - 100 (energetic)

    protected static final Random random = new Random();

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = random.nextInt(40) + 30;
        this.mood = random.nextInt(40) + 30;
        this.energy = random.nextInt(40) + 30;
    }

    // Constructor with user-specified values
    public Pet(String name, String type, int age, int hunger, int mood, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = clamp(hunger);
        this.mood = clamp(mood);
        this.energy = clamp(energy);
    }

    // Polymorphic method
    public abstract void makeSound();

    // Encapsulated state modifiers
    protected void increaseMood(int value) {
        mood = clamp(mood + value);
    }

    protected void decreaseHunger(int value) {
        hunger = clamp(hunger - value);
    }

    protected void decreaseEnergy(int value) {
        energy = clamp(energy - value);
    }

    protected void increaseEnergy(int value) {
        energy = clamp(energy + value);
    }

    private int clamp(int value) {
        return Math.max(0, Math.min(100, value));
    }

    // Read-only access
    public int getHunger() {
        return hunger;
    }

    public int getMood() {
        return mood;
    }

    public int getEnergy() {
        return energy;
    }

    public void showStatus() {
        System.out.println(name + " [" + type + "]");
        System.out.println("Hunger: " + hunger);
        System.out.println("Mood: " + mood);
        System.out.println("Energy: " + energy);
        System.out.println();
    }
}

