import warehouse_items.*;

public class Main {
    public static void main(String[] args) {
        Electronics electronics = new Electronics(1, "TV");
        Electronics electronics2 = new Electronics(2, "Speaker");
        Groceries groceries = new Groceries(3, "Golf");
        Groceries groceries2 = new Groceries(4, "GolfBag");
        Furniture furniture = new Furniture(5, "Sofa");
        Furniture furniture2 = new Furniture(6, "Bed");


        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(electronics);
        electronicsStorage.addItem(electronics2);
        groceriesStorage.addItem(groceries);
        groceriesStorage.addItem(groceries2);
        furnitureStorage.addItem(furniture);
        furnitureStorage.addItem(furniture2);


        Storage.displayStorageItems(electronicsStorage.getItems());
        Storage.displayStorageItems(groceriesStorage.getItems());
        Storage.displayStorageItems(furnitureStorage.getItems());
    }
}