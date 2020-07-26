package pl.sda.jpaspring;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String isbn;

    private String productName;

    @Enumerated(EnumType.STRING)
    private ProductType productType;

    public Product() {
    }

    public Product( String isbn, String productName, ProductType productType){
        this.isbn = isbn;
        this.productName = productName;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return
                "ID: " + id +
                "  ,   ISBN: " + isbn +
                "  ,   NAZWA: " + productName +
                "  ,   TYP: " + productType;
    }
}
