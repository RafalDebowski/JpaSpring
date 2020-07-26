package pl.sda.jpaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {


    @RequestMapping("/products")
    public String productForm(){
        return "productForm";
    }

    @RequestMapping("/addProduct")
    public String addProduct(String productNameInput, String isbnInput, String productTypeInput){
        ProductService.addProduct(productNameInput,isbnInput,productTypeInput );
        return "productForm";
    }

}
