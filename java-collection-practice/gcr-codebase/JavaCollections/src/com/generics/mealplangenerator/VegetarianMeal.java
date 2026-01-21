package com.generics.mealplangenerator;

public class VegetarianMeal implements MealPlan {

    private int calories;

    public VegetarianMeal(int calories) {
        this.calories = calories;
    }

    @Override
    public boolean isValid() {
        return calories <= 2500;
    }

    @Override
    public String getPlanDetails() {
        return "Vegetarian Meal | Calories: " + calories;
    }
}
