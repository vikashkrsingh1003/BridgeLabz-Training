package com.generics.mealplangenerator;

public class MealGenerator {

    public static <T extends MealPlan> Meal<T> generateMeal(T mealPlan) {

        if (mealPlan.isValid()) {
            System.out.println("Meal Plan Approved");
            return new Meal<>(mealPlan);
        }

        System.out.println("Invalid Meal Plan");
        return null;
    }
}
