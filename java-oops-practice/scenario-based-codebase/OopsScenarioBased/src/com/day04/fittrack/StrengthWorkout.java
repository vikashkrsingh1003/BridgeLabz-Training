package com.day04.fittrack;

class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public double calculateCalories() {
        // Strength burns slower: 5 cal per minute
        return getDuration() * 5;
    }
}