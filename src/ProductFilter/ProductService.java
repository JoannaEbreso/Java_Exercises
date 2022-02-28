package ProductFilter;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    public List<Product> filterProduct(List<Product> products, HashMap<String, Object> filterValues){
        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getSize() == filterValues.get("size") && product.getColor() == filterValues.get("colour"))
                .collect(Collectors.toList());

        return filteredProducts;
    }
}
