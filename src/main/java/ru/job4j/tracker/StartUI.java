package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item(1, "FixBugs");
        tracker.add(item);
        tracker.findById(1);
        System.out.println(item);
    }
}
