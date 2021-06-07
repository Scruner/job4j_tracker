package ru.job4j.stream;

import java.util.stream.Stream;

public class Card {

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Suit[] suits = Suit.values();
        Value[] vls = Value.values();
        Stream.of(suits)
                .flatMap(s -> Stream.of(vls).map(v -> (new Card(s, v))))
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit="
                + suit
                + ", value="
                + value
                + '}';
    }
}
