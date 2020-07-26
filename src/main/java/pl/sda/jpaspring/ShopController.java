package pl.sda.jpaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ShopController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/shop")
    public String shop(Model model){
        List<Product> productList = productService.findAllProducts();
        List<Customer> customerList = customerService.findAllCustomers();
        model.addAttribute(productList);
        model.addAttribute(customerList);
        return "shopPage";
    }



}
