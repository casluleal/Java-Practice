package Tests;

import Classes.Product;
import junit.framework.TestCase;

public class ProductTest extends TestCase {

    public void testGetPrice() {
        Product product = new Product(1, "Apple", 5.5, 5);

        assertEquals(product.getPrice(), 5.5);
    }
}
