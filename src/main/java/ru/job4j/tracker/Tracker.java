package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>(100);
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }


    public List<Item> findByName(String key) {
        int localSize = 0;
        List<Item> itemsWithoutDouble = new ArrayList<>(items.size());
        for (int index = 0; index < size; index++) {
            if (items.get(index).getName()
                    .equals(key)) {
                itemsWithoutDouble.set(localSize, items.get(index));
                localSize++;
            }
        }
        return itemsWithoutDouble;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
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
            items.add(item);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items.set(size - 1, null);
            size--;
            return true;
        }
        return false;
    }
}