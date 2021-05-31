package ru.job4j.collection;

import java.util.HashMap;

public class FreezeStr {

    public static boolean eq(String left, String right) {
        boolean rsl = true;
        HashMap<String, String> hashMap = new HashMap<>();
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            if (!hashMap.containsValue(value)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
