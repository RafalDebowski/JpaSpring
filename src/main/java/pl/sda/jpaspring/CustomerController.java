package pl.sda.jpaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //to miejsce bedzie reagować na requesty z zewnatrz
public class CustomerController {
    @Autowired  //spring uzupelni w tym miejscu referencje do serwisu - DEPENDENCY INJECTION
    private CustomerService customerService;

    @RequestMapping("/")
    public String customersForm() {
        return "customersForm"; //nazwa pliku html ktory zostanie wyswietlony
    }

    @RequestMapping("/addCustomer") //to miejsce bedzie reagowac na requesty pod adres "/addCustomer"
    public String addCustomer(String firstNameInputValue,
                              String surnameInputValue,
                              String peselInputValue) { //te wartosci przyjda z formularza

        customerService.addCustomer(firstNameInputValue, surnameInputValue, peselInputValue);
        return "customersForm"; // to jest nazwa pliku html ktory zostanie wyswietlony
    }


}
