
package com.day04.fittrack;
public class FitTrackApp {
	
    public static void main(String[] args) {
        // Create user with custom goal
        UserProfile user = new UserProfile("Aarav", 22, 72.5, 2200);
        System.out.println(user);

        // Perform a cardio workout
        Workout w1 = new CardioWorkout(30);
        w1.startWorkout();
        w1.stopWorkout();
        System.out.println("Cardio calories burned: " + w1.getCaloriesBurned());

        // Perform a strength workout
        Workout w2 = new StrengthWorkout(40);
        w2.startWorkout();
        w2.stopWorkout();
        System.out.println("Strength calories burned: " + w2.getCaloriesBurned());

        // Operator-like calculation
        double totalBurned = w1.getCaloriesBurned() + w2.getCaloriesBurned();
        System.out.println("Remaining calories today: " + user.remainingCalories((int) totalBurned));
    }
}
