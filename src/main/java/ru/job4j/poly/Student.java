package ru.job4j.poly;

public class Student {

    public static void main(String[] args) {
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle bus3 = new Bus();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle train3 = new Train();
        Vehicle plane1 = new Plane();
        Vehicle plane2 = new Plane();
        Vehicle plane3 = new Plane();
        Vehicle[] vehicles = {bus1, bus2, bus3, train1, train2, train3, plane1, plane2, plane3};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.speed();
        }
    }
}
