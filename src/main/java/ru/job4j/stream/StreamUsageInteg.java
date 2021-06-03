package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsageInteg {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(3, -4, 56, -97, -2, 33, 27));
        List<Integer> positiveNum = arrayList.stream()
                .filter(arr -> arr > 0)
                .collect(Collectors.toList());
        positiveNum.forEach(System.out::println);
    }
}
