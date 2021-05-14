package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    private int position;

    public StringCompare(int position) {
        this.position = position;
    }

    public StringCompare() {
    }

    @Override
    public int compare(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (char i = 0; i < min; i++) {
           int rsl = Character.compare(left.charAt(i), right.charAt(i));
           if (rsl != 0) {
               return rsl;
           }
        }
        return Integer.compare(left.length(), right.length());
    }
}
