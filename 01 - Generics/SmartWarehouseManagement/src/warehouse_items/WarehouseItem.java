package warehouse_items;

public abstract class WarehouseItem {
    private int id;
    private String name;

    public WarehouseItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WarehouseItem{" + "id=" + id + ", name=" + name + '}';
    }
}