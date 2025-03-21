import product_categories.*;

public class Product <T extends ICategory>{
    private String name;
    private T category;

    public Product(String name, T category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getCategory() {
        return category;
    }

    public void setCategory(T category) {
        this.category = category;
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        System.out.println("Discount applied for " + product.getName() + " with percentage " + percentage);
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", category=" + category + "]";
    }
}