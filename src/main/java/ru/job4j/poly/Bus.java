package ru.job4j.poly;

public class Bus implements Transport {

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
}
