package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testRide {
    @Test
    void testCreate() {
        Ride ride = new Ride(2, 3, 15.3);
        assertEquals(2, ride.getNumberOfDay());
        assertEquals(3, ride.getRidePerDay());
        assertEquals(15.3, ride.getKm());
    }
}
