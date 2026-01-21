package com.generics.mealplangenerator;

public class Main {

    public static void main(String[] args) {

        VegetarianMeal veg = new VegetarianMeal(2000);
        KetoMeal keto = new KetoMeal(30);
        VeganMeal vegan = new VeganMeal(false);
        HighProteinMeal protein = new HighProteinMeal(120);

        Meal<?> m1 = MealGenerator.generateMeal(veg);
        Meal<?> m2 = MealGenerator.generateMeal(keto);
        Meal<?> m3 = MealGenerator.generateMeal(vegan);
        Meal<?> m4 = MealGenerator.generateMeal(protein);

        if (m1 != null) m1.showMeal();
        if (m2 != null) m2.showMeal();
        if (m3 != null) m3.showMeal();
        if (m4 != null) m4.showMeal();
    }
}
