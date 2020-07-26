package pl.sda.jpaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public  void addProduct(String productNameInput, String isbnInput, String productTypeInput) {
        ProductType productType = ProductType.valueOf(productTypeInput.toUpperCase());
        Product product = new Product(isbnInput, productNameInput, productType);
        productRepository.save(product);

    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
