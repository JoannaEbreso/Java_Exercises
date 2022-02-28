package ProductFilter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductFilterTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Product product1 = new Product(Colour.GREEN, Size.MEDIUM, "lavender");
        Product product2 = new Product(Colour.GREEN, Size.LARGE, "delight");
        Product product3 = new Product(Colour.BLUE, Size.SMALL, "carriage");
        Product product4 = new Product(Colour.GREEN, Size.MEDIUM, "desire");
        Product product5 = new Product(Colour.RED, Size.MEDIUM, "plot");
        Product product6 = new Product(Colour.BLUE, Size.MEDIUM, "chrims");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);


        ProductService newProductService = new ProductService();
        HashMap<String, Object> newFilterValues = new HashMap<>();
        List<Product> filteredProducts;

        newFilterValues.put("colour",Colour.GREEN);
        newFilterValues.put("size",Size.MEDIUM);


        filteredProducts = newProductService.filterProduct(products, newFilterValues);

        filteredProducts.forEach(product -> System.out.println(product.getName()));
    }
}