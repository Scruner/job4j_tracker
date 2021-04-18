package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        scanner.nextLine();
        int answerRequest = new Random().nextInt(3);
        if (answerRequest == 0) {
            System.out.println("Да");
        } else if (answerRequest == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
