package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
            return Arrays.copyOf(itemsWithoutNull, size);
        }


    public Item[] findByName(String key) {
        int localSize = 0;
        Item[] itemsWithoutDouble = new Item[items.length];
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                itemsWithoutDouble[localSize] = items[index];
                localSize++;
            }
        }
        return Arrays.copyOf(itemsWithoutDouble, localSize);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}