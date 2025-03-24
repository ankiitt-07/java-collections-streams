package collections.ShoppingCart;

import collections.ShoppingCart.cart.Cart;
import collections.ShoppingCart.product.Product;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product product1 = new Product("Apple", 199);
        Product product2 = new Product("Banana", 399);
        Product product3 = new Product("Orange", 99);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product1);

        cart.display();
    }
}

