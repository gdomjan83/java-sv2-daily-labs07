package day;

import java.time.LocalDate;

public class Product {
    private String productName;
    private LocalDate dateOfSell;
    private int price;

    public Product(String productName, LocalDate dateOfSell, int price) {
        this.productName = productName;
        this.dateOfSell = dateOfSell;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public LocalDate getDateOfSell() {
        return dateOfSell;
    }

    public int getPrice() {
        return price;
    }
}
