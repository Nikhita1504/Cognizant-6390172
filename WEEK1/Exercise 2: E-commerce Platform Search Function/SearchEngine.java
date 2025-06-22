import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private List<Product> products;

    public SearchEngine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> searchByName(String keyword) {
        List<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(p);
            }
        }
        return results;
    }

    public List<Product> searchByCategory(String category) {
        List<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.getCategory().equalsIgnoreCase(category)) {
                results.add(p);
            }
        }
        return results;
    }

    public List<Product> searchByPriceRange(double min, double max) {
        List<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() >= min && p.getPrice() <= max) {
                results.add(p);
            }
        }
        return results;
    }
}
