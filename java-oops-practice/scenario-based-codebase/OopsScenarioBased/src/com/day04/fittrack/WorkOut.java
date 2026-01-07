package com.day04.fittrack;

abstract class Workout implements ITrackable {
    private String type;
    private int duration; // in minutes
    private double caloriesBurned;
    protected boolean isActive;

    // Internal workout logs, restricted from outside
    protected StringBuilder internalLog = new StringBuilder();

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    // Polymorphic method — differs by workout type
    public abstract double calculateCalories();

    public void startWorkout() {
        isActive = true;
        internalLog.append("Workout started.\n");
    }

    public void stopWorkout() {
        isActive = false;
        caloriesBurned = calculateCalories();
        internalLog.append("Workout stopped. Calories burned: " + caloriesBurned + "\n");
    }

    // Public safe getter, does NOT expose internal logs directly
    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public int getDuration() {
        return duration;
    }

    public String getType() {
        return type;
    }
}
