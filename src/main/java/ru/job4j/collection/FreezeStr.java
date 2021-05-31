package ru.job4j.collection;

import java.util.HashMap;

public class FreezeStr {

    public static boolean eq(String left, String right) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int count = 1;
        if (left.length() != right.length()) {
            return false;
        }
        for (Character c : left.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }
        for (Character c : right.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                return false;
            } else {
                hashMap.put(c, hashMap.get(c) - 1);
            }
        }
        for (Character c : hashMap.keySet()) {
            if (hashMap.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}
//        if (left.length() != right.length()) {
//            return false;
//        }
//        char[] a = left.toCharArray();
//        char[] b = right.toCharArray();
//
//        Arrays.sort(a);
//        Arrays.sort(b);
//        return Arrays.equals(a, b);
//    }
//

