package com.food;

public class FoodDataProcessor {
    public double calculateCaloriesPerServing(int fatgrams, int calories, int servings) {
        double totalCalories = fatgrams * calories;
        double caloriesPerServing = totalCalories / servings;
        return Math.round(caloriesPerServing * 100.0) / 100.0; // Round off to 2 decimal places
    }
}