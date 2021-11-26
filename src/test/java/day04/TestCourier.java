package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCourier {

    Courier courier = new Courier();

    @Test
    void testFirstRide() {
        courier.addRide(new Ride(1, 3, 10));
        assertEquals(10, courier.getRides().get(0).getKm());
        assertEquals(1, courier.getRides().size());
    }

    @Test
    void testAddSeveralRides() {
        courier.addRide(new Ride(1, 3, 10));
        courier.addRide(new Ride(2,5, 15));
        assertEquals(2, courier.getRides().size());
        assertEquals(5, courier.getRides().get(1).getRideOfDay());
    }

    @Test
    void testWrongRide1() {
        courier.addRide(new Ride(1, 3, 10));
        courier.addRide(new Ride(2,5, 15));
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> courier.addRide(new Ride(1,5, 15)));
        assertEquals("New ride data is not in sync with previous data.", e.getMessage());
    }

    @Test
    void testWrongRide2() {
        courier.addRide(new Ride(1, 3, 10));
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> courier.addRide(new Ride(1,1, 15)));
        assertEquals("New ride data is not in sync with previous data.", e.getMessage());
    }
}
