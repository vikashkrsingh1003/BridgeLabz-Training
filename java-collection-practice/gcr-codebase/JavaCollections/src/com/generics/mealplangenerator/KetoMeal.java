package com.generics.mealplangenerator;

public class KetoMeal implements MealPlan {

    private int carbs;

    public KetoMeal(int carbs) {
        this.carbs = carbs;
    }

    @Override
    public boolean isValid() {
        return carbs < 50;
    }

    @Override
    public String getPlanDetails() {
        return "Keto Meal | Carbs: " + carbs;
    }
}
