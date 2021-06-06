package ru.job4j.stream;

import com.sun.jdi.Value;

import java.util.stream.Stream;

public class Card {

    private static Value V_6;
    private static Value V_7;
    private static Value V_8;
    private static Suit Diamonds;
    private static Suit Hearts;
    private static Suit Spades;
    private static Suit Clubs;
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Suit[] suits = {Diamonds, Hearts, Spades, Clubs};
        Value[] values = {V_6, V_7, V_8};
        Stream.of(suits)
                .flatMap(s -> Stream.of(values)
                .map(v -> s + " " + v))
                .forEach(System.out::println);
    }
}
