package com.generics.mealplangenerator;

public class VeganMeal implements MealPlan {

    private boolean usesAnimalProducts;

    public VeganMeal(boolean usesAnimalProducts) {
        this.usesAnimalProducts = usesAnimalProducts;
    }

    @Override
    public boolean isValid() {
        return !usesAnimalProducts;
    }

    @Override
    public String getPlanDetails() {
        return "Vegan Meal | Animal Products Used: " + usesAnimalProducts;
    }
}
