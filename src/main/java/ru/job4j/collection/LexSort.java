package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] stringsLeft = left.split(". ", 2);
        String[] stringsRight = right.split(". ", 2);

        return Integer.valueOf(stringsLeft[1]) - Integer.valueOf(stringsRight[1]);
    }
}
