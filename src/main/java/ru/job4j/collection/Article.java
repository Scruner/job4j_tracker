package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {

    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] arrayOrigin = origin.replaceAll("\\p{P}", "").split(" ");
        String[] arrayLine = line.replaceAll("\\p{P}", "").split(" ");
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(arrayOrigin));
        for (String lne : arrayLine) {
            if (!hashSet.contains(lne)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}


