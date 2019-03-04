package Tests;

import Classes.Inventory;
import Classes.Product;
import junit.framework.TestCase;

public class InventoryTest extends TestCase {

    public void testSumPrices() {
        Inventory i = new Inventory();
        i.addProduct(new Product(1, "Apple", 2.5, 1));
        i.addProduct(new Product(2, "Strawberry", 3, 5));
        i.addProduct(new Product(3, "Banana", 5, 1));

        assertEquals(i.sumPrices(), 22.50);
    }
}
