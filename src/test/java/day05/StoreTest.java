package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    @TempDir
    File tempDir;

    @BeforeEach
    void init() {
        store.addProduct(new Product("Mouse", LocalDate.of(2021, 11, 25), 3000));
        store.addProduct(new Product("Keyboard", LocalDate.of(2021, 10, 15), 5000));
        store.addProduct(new Product("Monitor", LocalDate.of(2021, 10, 5), 36000));
    }

    @Test
    void testAddCorrectProduct() {
        assertEquals(3, store.getProducts().size());
        assertEquals("Keyboard", store.getProducts().get(1).getProductName());
    }

    @Test
    void testAddWrongProduct() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> store.addProduct(new Product("Mouse", LocalDate.of(2021, 12, 25), 3000)));
        assertEquals("Date of transaction error.", iae.getMessage());
    }

    @Test
    void testWriteFile() throws IOException {
        Path dir = tempDir.toPath();

        Path resultPath = store.writeProductListByMonth(Month.OCTOBER, dir);
        List<String> result = Files.readAllLines(resultPath);
        assertEquals(2, result.size());
        assertEquals("Monitor", result.get(1).split(";")[0]);
    }
}