package com.day06.tourmate;

public class Activity {

	private String activityName;
    private double cost;

    public Activity(String activityName, double cost) {
        this.activityName = activityName;
        this.cost = cost;
    }

    double getCost() {
        return cost;
    }
}
