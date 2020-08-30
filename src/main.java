import java.util.LinkedList;
import java.util.List;

class Store implements Basket {
    private List<Item> store = new LinkedList<Item>();

    public static void main(String[] args) {
        Store stores = new Store();

        stores.addProduct("milk", 1);
        stores.addProduct("bread", 3);
        stores.addProduct("chickory", 2);

        showStore("Add elements", stores.store);
        stores.removeProduct("milk");
        showStore("Delete elements ", stores.store);
        stores.updateProductQuantity("bread", 3);
        showStore("Change some much", stores.store);
    }

    private static void showStore(String title, List<Item> store) {
        System.out.println(title);
        for (Item l : store) {
            System.out.println("Item: " + l);
        }
        System.out.println();
    }

    @Override
    public void addProduct(String product, int quantity) {
        Item item = new Item();
        item.setName(product);
        item.setCount(quantity);
        store.add(item);
    }

    @Override
    public void removeProduct(String product) {

        Item item = new Item();
        item.setName(product);
        store.remove(item);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
    }

    @Override
    public void clear() {
        store.clear();
    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}