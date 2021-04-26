package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Train travels by rail");
    }

    @Override
    public void speed() {
        System.out.println("The average train speed is 80 km/h");
    }
}
