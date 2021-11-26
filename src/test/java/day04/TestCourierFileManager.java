package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class TestCourierFileManager {

    CourierFileManager fm = new CourierFileManager();

    @Test
    void testCreateCourierByFile() {
        Path path = Paths.get("src/test/resources/rideData.txt");
        Courier courier = fm.createCourierByFile(path);

        assertEquals(1, courier.getRides().get(0).getDayOfRide());
        assertEquals(2, courier.getRides().get(4).getRideOfDay());
        assertEquals(10, courier.getRides().get(2).getKm());
        assertEquals(6, courier.getRides().size());
    }

    @Test
    void testWrongFile() {
        Path path = Paths.get("src/test/resources/rideta.txt");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> fm.createCourierByFile(path));
        assertEquals("File not found", iae.getMessage());
    }
}