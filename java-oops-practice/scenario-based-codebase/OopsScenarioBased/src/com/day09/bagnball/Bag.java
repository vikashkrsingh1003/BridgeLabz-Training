package com.day09.bagnball;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls;

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // Add a ball (with capacity check)
    public boolean addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag " + id + " is full. Cannot add ball.");
            return false;
        }
        balls.add(ball);
        return true;
    }

    // Remove a ball by ID
    public boolean removeBall(String ballId) {
        for (Ball ball : balls) {
            if (ball.getId().equals(ballId)) {
                balls.remove(ball);
                return true;
            }
        }
        return false;
    }

    // Display all balls in the bag
    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("Bag " + id + " has no balls.");
            return;
        }
        System.out.println("Balls in Bag " + id + ":");
        for (Ball ball : balls) {
            System.out.println("  - " + ball.getDescription());
        }
    }

    // Get ball count
    public int getBallCount() {
        return balls.size();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getDescription() {
        return "Bag [ID=" + id + ", Color=" + color + ", Capacity=" + capacity +
               ", Balls=" + balls.size() + "]";
    }
}

