package day;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product productSold) {
        if (productSold.getDateOfSell().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Date of transaction error.");
        } else {
            products.add(productSold);
        }
    }

    public void writeProductList(Month month, Path path) {
        writeFile(path, sortProductsByMonth(month));
    }

    private List<String> sortProductsByMonth(Month month) {
        List<String> productsSoldInMonth = new ArrayList<>();
        for (Product actual : products) {
            if (actual.getDateOfSell().getMonth() == month) {
                productsSoldInMonth.add(getProductData(actual));
            }
        }
        return productsSoldInMonth;
    }

    private void writeFile(Path path, List<String> data) {
        try {
            Files.write(path, data);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file.", ioe);
        }
    }

    private String getProductData(Product product) {
        return product.getName() + ";" + String.valueOf(product.getDateOfSell()) + ";" + product.getPrice();
    }
}
