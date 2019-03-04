import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double sumPrices() {
        double sum = 0;

        for (Product product: products) {
            sum += product.getPrice() * product.getQuantity();
        }

        return Math.floor(sum * 100) / 100;
    }
}
