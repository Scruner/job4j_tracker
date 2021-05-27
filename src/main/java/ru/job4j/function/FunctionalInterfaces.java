package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = map::put;
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.forEach(biCon);

        BiPredicate<Integer, String> biPred = (intg, s) -> (intg % 2 == 0 || map.get(intg).length() == 4);
        for (Integer i : map.keySet()) {
            if (i % 2 == 0 || map.get(i).length() == 4) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = new ArrayList<>(map.values());

        Consumer<String> con = System.out::println;
        Function<String, String> func = String::toUpperCase;
        for (String s : strings) {
            System.out.println(s.toUpperCase());

        }
    }
}
