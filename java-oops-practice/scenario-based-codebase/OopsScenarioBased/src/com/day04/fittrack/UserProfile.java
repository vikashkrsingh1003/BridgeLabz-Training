package com.day04.fittrack;

class UserProfile {
    private String name;
    private int age;
    private double weight; // private → encapsulation
    private int dailyCalorieGoal;

    // Default constructor
    public UserProfile(String name) {
        this(name, 18, 60.0, 2000);  // default age, weight, goal
    }

    // Custom constructor
    public UserProfile(String name, int age, double weight, int dailyCalorieGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    // Getter for weight (protected by access rules)
    public double getWeight() {
        return weight;
    }

    // Setter for weight (if needed)
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    // Compute remaining calories (operator-like behavior)
    public int remainingCalories(int burned) {
        return dailyCalorieGoal - burned;
    }

    @Override
    public String toString() {
        return "User: " + name + " | Age: " + age + " | Weight: " + weight + 
               "kg | Daily Goal: " + dailyCalorieGoal + " cal";
    }
}