package day;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate dateOfSell;
    private int price;

    public Product(String name, LocalDate dateOfSell, int price) {
        this.name = name;
        this.dateOfSell = dateOfSell;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfSell() {
        return dateOfSell;
    }

    public int getPrice() {
        return price;
    }
}
