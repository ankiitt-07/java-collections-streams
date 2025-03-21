package meal_plans;

public class NonVegetarianMeal implements IMealPlan {
    private String name;
    private String calories;

    public NonVegetarianMeal(String name, String calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCalories() {
        return calories;
    }
    public void setCalories(String calories) {
        this.calories = calories;
    }

    @Override
    public void display() {
        System.out.println("Non-Vegetarian MealName: " + name+ " , Calories: " + calories);
    }
}
