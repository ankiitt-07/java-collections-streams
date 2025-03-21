import meal_plans.IMealPlan;
import meal_plans.NonVegetarianMeal;
import meal_plans.VegetarianMeal;

public class Main {
    public static  <T extends IMealPlan> Meal<?> generateMeal(T meal){
        return new Meal<T>(meal, 10);
    }

    public static void main(String[] args) {
        VegetarianMeal vegMeal = new VegetarianMeal("Paneer", "200");
        NonVegetarianMeal nonVegMeal = new NonVegetarianMeal("Chicken", "120");

        Meal<?> meal = generateMeal(nonVegMeal);
        meal.display();
        Meal<?> meal2 = generateMeal(vegMeal);
        meal2.display();
    }
}