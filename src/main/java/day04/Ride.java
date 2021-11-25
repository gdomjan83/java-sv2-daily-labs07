package day04;

public class Ride {
    private int numberOfDay;
    private int ridePerDay;
    private double km;

    public Ride(int numberOfDay, int ridePerDay, double km) {
        this.numberOfDay = numberOfDay;
        this.ridePerDay = ridePerDay;
        this.km = km;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public int getRidePerDay() {
        return ridePerDay;
    }

    public double getKm() {
        return km;
    }
}
