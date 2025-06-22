import java.util.List;

public class Main {
    public static void main(String[] args) {
        SearchEngine engine = new SearchEngine();

        engine.addProduct(new Product("iPhone 15", "Electronics", 999));
        engine.addProduct(new Product("Samsung TV", "Electronics", 499));
        engine.addProduct(new Product("Nike Shoes", "Footwear", 120));
        engine.addProduct(new Product("Levi's Jeans", "Clothing", 60));

        List<Product> nameSearch = engine.searchByName("iphone");
        for (Product p : nameSearch) {
            p.display();
        }

        List<Product> categorySearch = engine.searchByCategory("Electronics");
        for (Product p : categorySearch) {
            p.display();
        }

        List<Product> priceSearch = engine.searchByPriceRange(100, 600);
        for (Product p : priceSearch) {
            p.display();
        }
    }
}
