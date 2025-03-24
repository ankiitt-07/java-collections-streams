package collections.ShoppingCart.cart;


import collections.ShoppingCart.product.Product;

import java.util.*;

public class Cart {
    private final HashMap<Product, Integer> productPrices;
    private final LinkedHashMap<Product, Integer> products;

    public Cart() {
        productPrices = new HashMap<>();
        products = new LinkedHashMap<>();
    }

    public HashMap<Product, Integer> getProductPrices() {
        return productPrices;
    }

    public LinkedHashMap<Product, Integer> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.put(product, products.getOrDefault(product, 0) + 1);
        productPrices.put(product, product.getPrice());
    }

    public void display(){
        TreeMap<Integer, List<Product>> sorted = new TreeMap<>();
        for (Product item : products.keySet()) {
            int price = productPrices.getOrDefault(item, 0);
            sorted.computeIfAbsent(price, k -> new ArrayList<>()).add(item);
        }

        for (Map.Entry<Integer, List<Product>> entry : sorted.entrySet()) {
            double price = entry.getKey();
            for (Product item : entry.getValue()) {
                int qty = products.get(item);
                System.out.printf("%s x%d @ %.2f each → %.2f\n", item, qty, price, price * qty);
            }
        }
    }
}
