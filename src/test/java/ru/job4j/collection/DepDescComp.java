package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] o1Spl = o1.split("/");
        String[] o2Spl = o2.split("/");
        int rsl = o2Spl[0].compareTo(o1Spl[0]);
        if (rsl == 0) {
            o1.compareTo(o2);
        }
        return rsl;
    }
}
