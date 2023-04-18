import java.util.List;
import java.util.StringJoiner;

public class Basket {
    private List<Product> products;

    @Override
    public String toString() {
        return new StringJoiner(", ", Basket.class.getSimpleName() + "[", "]")
                .add("products=" + products)
                .toString();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Basket(List<Product> products) {
        this.products = products;
    }
}
