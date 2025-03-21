import meal_plans.IMealPlan;

public class Meal<T extends IMealPlan> {
    private T mealPlan;
    private int days;

    public Meal(T mealPlan, int days) {
        this.mealPlan = mealPlan;
        this.days = days;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void display() {
        System.out.println("Meal Plan: ");
        mealPlan.display();
        System.out.println("Days: " + days);
    }
}