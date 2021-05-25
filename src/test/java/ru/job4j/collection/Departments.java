package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value :
                deps) {
            String start = "";
            for (String el :
                    value.split("/")) {
                tmp.add(start + "/" + el);
            }
        }
        return new ArrayList<>();
    }

    public static void sortAsc(List<String> orgs) {
        List<String> sorted = new ArrayList<>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        sorted.addAll(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        List<String> sorted = new ArrayList<>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        sorted.addAll(orgs);
    }
}
