package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(-4);
        arrayList.add(56);
        arrayList.add(-97);
        arrayList.add(-2);
        arrayList.add(33);
        arrayList.add(27);
        List<Integer> positiveNum = arrayList.stream().filter(
                arr -> arr > 0).collect(Collectors.toList());
        positiveNum.forEach(System.out::println);
    }
}
