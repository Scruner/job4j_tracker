package ru.job4j.oop;

public class Calculator {

  private static int x = 5;

  public static int sum(int y) {
    return x + y;
  }

  public static int minus(int c) {
    return c - x;
  }

  public int multiply(int a) {
    return x * a;
  }

  public int divide(int d) {
    return d / x;
  }

  public int sumAllOperation(int e) {
    return sum(e) + minus(e) + multiply(e) + divide(e);
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int rslMultiply = calculator.multiply(5);
    int result = sum(10);
    int rslMinus = minus(14);
    int rslDivide = calculator.divide(25);
    int rslSumAllOperation = calculator.sumAllOperation(15);
    System.out.println(result);
    System.out.println(rslMultiply);
    System.out.println(rslMinus);
    System.out.println(rslDivide);
    System.out.println(rslSumAllOperation);
  }
}
