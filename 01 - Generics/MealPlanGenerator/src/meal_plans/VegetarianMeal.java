package meal_plans;

public class VegetarianMeal implements IMealPlan{
    private String name;
    private String calories;

    public  VegetarianMeal(String name , String calories){
        this.name=name;
        this.calories=calories;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getCalories(){
        return calories;
    }
    public void setCalories(String calories){
        this.calories=calories;
    }

    @Override
    public void display(){
        System.out.println("Vegetarian Meal Name: "+name + " , calories: "+calories);
    }
}
