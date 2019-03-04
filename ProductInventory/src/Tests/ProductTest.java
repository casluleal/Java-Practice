package Tests;

import Classes.Product;
import junit.framework.TestCase;

public class ProductTest extends TestCase {

    private Product getExampleProduct() {
        return new Product(1, "Apple", 5.5, 5);
    }

    public void testGetPrice() {
        Product p = getExampleProduct();
        assertEquals(p.getPrice(), 5.5);
    }


    public void testGetQuantity() {
        Product p = getExampleProduct();
        assertEquals(p.getQuantity(), 5);
    }

}
