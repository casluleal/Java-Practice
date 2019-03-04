public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(1, "Apple", 2.5, 5));
        inventory.addProduct(new Product(2, "Strawberry", 3, 15));
        inventory.addProduct(new Product(2, "Banana", 1, 3));

        System.out.println(inventory.sumPrices());
    }
}
