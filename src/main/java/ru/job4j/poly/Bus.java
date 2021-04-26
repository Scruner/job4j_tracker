package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    private int rideKm = 0;
    private int priceLitreFuel = 0;

    @Override
    public void ride() {
        System.out.println(rideKm);
    }

    @Override
    public void passangers(int psgrs) {
        System.out.println(psgrs);
    }

    @Override
    public int refuel(int litreFuel) {
        return litreFuel * priceLitreFuel;
    }

    @Override
    public void move() {
        System.out.println("Bus is on the highway");
    }

    @Override
    public void speed() {
        System.out.println("The average bus speed is 60 km/h");
    }
}
