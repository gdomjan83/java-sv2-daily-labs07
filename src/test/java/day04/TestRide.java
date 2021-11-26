package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRide {
    @Test
    void testCreate() {
        Ride ride = new Ride(2, 3, 15.3);
        assertEquals(2, ride.getDayOfRide());
        assertEquals(3, ride.getRideOfDay());
        assertEquals(15.3, ride.getKm());
    }
}
