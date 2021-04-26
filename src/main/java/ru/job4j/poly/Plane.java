package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("Plane is fly");
    }

    @Override
    public void speed() {
        System.out.println("The average plane speed is 900 km/h");
    }
}
