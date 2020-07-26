package pl.sda.jpaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public static void addProduct(String productNameInput, String isbnInput, String productTypeInput) {

    }
}
