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
        return left.length() - right.length() != 0 ? left.length() - right.length() :
                Character.compare(left.charAt(position), right.charAt(position));
    }
}



// Integer.compare(left.length(), right.length());
//         int max = Math.min(left.length(), right.length());
//         for (char i = 0; i < max; i++) {
//        Character.compare(left.charAt(i), right.charAt(i));
//        }
//        return 0;
//        }