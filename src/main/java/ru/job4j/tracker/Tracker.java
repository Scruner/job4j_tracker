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
            if (items[index].getName()
                    .equals(key)) {
                itemsWithoutDouble[localSize] = items[index];
                localSize++;
            }
        }
        return Arrays.copyOf(itemsWithoutDouble, localSize);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

//    public boolean delete(int id) {
//        int index = indexOf(id);
//        if (index != -1) {
//            int start = index + 1;
//            int distPos = index;
//            int length = size - index;
//            System.arraycopy(items, start, items, distPos, length);
//            items[size - 1] = null;
//            size--;
//            return true;
//        }
//        return false;
//    }
}