package com.day04.fittrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public double calculateCalories() {
        // Simple formula: 8 cal per minute
        return getDuration() * 8;
    }
}
