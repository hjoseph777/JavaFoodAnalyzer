package com.food;
import java.util.Scanner;

public class FoodDataAnalyzerMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name of the food item");
        String foodItem = sc.nextLine();

        System.out.println("Enter fatgrams");
        int fatgrams = sc.nextInt();
        sc.nextLine();
       
        int calories = 9; // Fixed quantity grams = 9; 
        System.out.println("Calories per grams = " + calories);
        
        System.out.println("Enter the number of Servings");
        int servings = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        
        // Create an instance of FoodDataProcessor and call the method
        FoodDataProcessor dataProcessor = new FoodDataProcessor();
        double result = dataProcessor.calculateCaloriesPerServing(fatgrams, calories, servings);
        
        System.out.println("Calories in " + foodItem + " per serving: " + result);
        
        sc.close(); // Close the scanner
    }
}