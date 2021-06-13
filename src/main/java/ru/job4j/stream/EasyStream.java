package ru.job4j.stream;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {

    public static EasyStream of(List<Integer> source) {
        throw new UnsupportedOperationException();
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        throw new UnsupportedOperationException();
    }

    public EasyStream filter(Predicate<Integer> fun) {
        throw new UnsupportedOperationException();
    }

    public List<Integer> collect() {
        throw new UnsupportedOperationException();
    }

    static class Builder {

        public Builder of() {
            return this;
        }

        public Builder map() {
            return this;
        }

        public Builder filter() {
            return this;
        }

        public Builder collect() {
            return this;
        }

        EasyStream build() {
            return new EasyStream();
        }
    }

    public static void main(String[] args) {
        EasyStream easyStream = new Builder().of()
                .map()
                .filter()
                .collect()
                .build();
    }
}

