package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCourier {

    Courier courier = new Courier();

//    @BeforeEach
//    void setUp() {
//        Ride ride1 = new Ride(1, 3, 10);
//        Ride ride2 = new Ride(2,5, 15);
//        Ride ride3 = new Ride(1, 1, 10);
//        Ride ride4 = new Ride(2, 1, 10);
//    }

    @Test
    void testAddRide() {
        courier.addRide(new Ride(1, 3, 10));
        courier.addRide(new Ride(2,5, 15));
        assertEquals(2, courier.getRides().size());
        assertEquals(5, courier.getRides().get(1).getRidePerDay());
    }
}
