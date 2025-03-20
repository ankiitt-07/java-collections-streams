import product_categories.ICategory;

import java.util.ArrayList;

public class ProductCatalog {
    private final ArrayList<Product<? extends ICategory>> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product<? extends ICategory> product) {
        products.add(product);
    }

    public void displayCatalog() {
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }


}