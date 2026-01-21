package com.generics.mealplangenerator;

public class Meal<T extends MealPlan> {

    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void showMeal() {
        System.out.println(mealPlan.getPlanDetails());
    }

    public T getMealPlan() {
        return mealPlan;
    }
}
