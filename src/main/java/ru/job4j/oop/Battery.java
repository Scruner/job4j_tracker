package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(10);
        Battery anotherBatt = new Battery(5);
        System.out.println("battary: " + battery.load + ". anotherBatt: " + anotherBatt.load);
        battery.exchange(anotherBatt);
        System.out.println("battary: " + battery.load + ". anotherBatt: " + anotherBatt.load);
    }
}
