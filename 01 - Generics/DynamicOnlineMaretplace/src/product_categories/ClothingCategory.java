package product_categories;

public class ClothingCategory implements ICategory {
    private String range;

    public ClothingCategory(String range) {
        this.range = range;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String toString() {
        return "ClothingCategory [range=" + range + "]";
    }
}
