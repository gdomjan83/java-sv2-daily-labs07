package day05;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testCreate() {
        Product product = new Product("Car", LocalDate.of(2021, 11, 20), 2_500_000);
        assertEquals("Car", product.getProductName());
        assertEquals(LocalDate.of(2021, 11, 20), product.getDateOfSell());
        assertEquals(2_500_000, product.getPrice());
    }
}