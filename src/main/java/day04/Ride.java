package day04;

public class Ride {
    private int dayOfRide;
    private int rideOfDay;
    private double km;

    public Ride(int dayOfRide, int rideOfDay, double km) {
        this.dayOfRide = dayOfRide;
        this.rideOfDay = rideOfDay;
        this.km = km;
    }

    public int getDayOfRide() {
        return dayOfRide;
    }

    public int getRideOfDay() {
        return rideOfDay;
    }

    public double getKm() {
        return km;
    }
}
