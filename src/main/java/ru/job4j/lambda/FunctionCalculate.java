package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculate {

    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (int i = start; i < end; i++) {
            rsl.add(func.apply((double)i));
        }
        return rsl;
    }

    public static void main(String[] args) {
        FunctionCalculate function = new FunctionCalculate();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> result2 = function.diapason(5, 8, x -> Math.pow(x, 2) + 1);
        List<Double> result3 = function.diapason(5, 8, x -> Math.pow(3, x));
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
