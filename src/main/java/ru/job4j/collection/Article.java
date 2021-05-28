package ru.job4j.collection;

import java.util.HashSet;

public class Article {

    public static boolean generateBy(String origin, String line) {
        String[] arrayLine = line.split(" ");
        HashSet<String> hashSet = new HashSet<>();
        for (String str : arrayLine) {
            hashSet.add(str);
        }
        return origin.contains((CharSequence) hashSet);
    }
}
