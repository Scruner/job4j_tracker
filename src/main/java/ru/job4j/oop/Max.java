package ru.job4j.oop;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int center) {
        int tmp = max(left, right);
        return tmp > center ? tmp : center;
    }

    public static int max(int left, int right, int center, int up) {
        int tmp = max(left, right, center);
        return tmp > up ? tmp : up;
    }

    public static void main(String[] args) {
        int c = Max.max(3, 4);
        System.out.println(c);
    }
}
