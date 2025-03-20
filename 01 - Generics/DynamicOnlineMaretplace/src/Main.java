import product_categories.BookCategory;
import product_categories.ClothingCategory;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        Product<BookCategory> book = new Product<>("Java Programming", new BookCategory("Educational"));
        Product<ClothingCategory> shirt = new Product<>("Designer Shirt", new ClothingCategory("Casual"));

        catalog.addProduct(book);
        catalog.addProduct(shirt);

        catalog.displayCatalog();

        Product.applyDiscount(book, 10);
    }
}