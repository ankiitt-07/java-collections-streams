import warehouse_items.WarehouseItem;
import java.util.ArrayList;

public class Storage <T extends WarehouseItem>{
    private final ArrayList<T> items;

    public Storage() {
        this.items = new ArrayList<>();
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void addItem(T item) {
        items.add(item);
    }

    public static void displayStorageItems(ArrayList<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}