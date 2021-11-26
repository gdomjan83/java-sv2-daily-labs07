package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCourier {

    Courier courier = new Courier();

    @Test
    void testAddRide() {
        courier.addRide(new Ride(1, 3, 10));
        courier.addRide(new Ride(2,5, 15));
        assertEquals(2, courier.getRides().size());
        assertEquals(5, courier.getRides().get(1).getRideOfDay());
    }
}
