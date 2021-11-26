package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return rides;
    }

    public boolean addRide(Ride ride) {
        if (rides.size() == 0) {
            return rides.add(ride);
        }

        int lastDay = rides.get(rides.size() - 1).getDayOfRide();
        if (lastDay < ride.getDayOfRide()) {
            return rides.add(ride);
        }

        int lastRide = rides.get(rides.size() - 1).getRideOfDay();
        if (lastRide < ride.getRideOfDay()) {
            return rides.add(ride);
        }

        throw new IllegalArgumentException("New ride data is not in sync with previous data.");
    }
}
