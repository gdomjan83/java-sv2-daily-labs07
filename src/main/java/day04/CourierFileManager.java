package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CourierFileManager {

    public Courier createCourierByFile(Path path) {
        try {
            List<String> file = Files.readAllLines(path);
            return readDataAndCreateCourier(file);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("File not found", ioe);
        }
    }

    private Ride createRide(String line) {
        String[] rideData = line.split(" ");
        return new Ride(Integer.valueOf(rideData[0]), Integer.valueOf(rideData[1]), Integer.valueOf(rideData[2]));
    }

    private Courier readDataAndCreateCourier(List<String> file) {
        Courier courier = new Courier();
        for (String line : file) {
            courier.addRide(createRide(line));
        }
        return courier;
    }
}
