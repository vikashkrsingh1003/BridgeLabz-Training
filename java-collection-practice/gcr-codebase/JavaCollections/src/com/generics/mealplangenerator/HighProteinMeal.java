package com.generics.mealplangenerator;

public class HighProteinMeal implements MealPlan {

    private int protein;

    public HighProteinMeal(int protein) {
        this.protein = protein;
    }

    @Override
    public boolean isValid() {
        return protein >= 100;
    }

    @Override
    public String getPlanDetails() {
        return "High Protein Meal | Protein: " + protein;
    }
}
