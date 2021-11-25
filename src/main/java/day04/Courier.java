package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return rides;
    }

    public void addRide(Ride ride) {



    }

    private int nextDayOfRide(Ride ride) {
        if (rides.size() == 0) {
            return 1;
        } else {
            return rides.get(rides.size() - 1).getDayOfRide();
        }
    }

    private int nextRideOfDay(Ride ride) {
        if (ride.getRideOfDay() == rides.get(rides.size() - 1).getRideOfDay()) {

        }
    }
}
