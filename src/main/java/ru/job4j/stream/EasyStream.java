package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {

    private List<Integer> list;

    private EasyStream() {
    }

    public static EasyStream of(List<Integer> source) {
        return new EasyStreamBuilder()
                .buildList(source)
                .build();
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i : list) {
            arrayList.add(fun.apply(i));
        }
        return new EasyStreamBuilder()
                .buildList(arrayList)
                .build();
    }

    public EasyStream filter(Predicate<Integer> fun) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i : list) {
            if (fun.test(i)) {
                arrayList.add(i);
            }
        }
        return new EasyStreamBuilder()
                .buildList(arrayList)
                .build();
    }

    public List<Integer> collect() {
        return list;
    }

    public static class EasyStreamBuilder {

        private List<Integer> list;

        public EasyStreamBuilder buildList(List<Integer> list) {
            this.list = list;
            return this;
        }

        public EasyStream build() {
            EasyStream easyStream = new EasyStream();
            easyStream.list = list;
            return easyStream;
        }
    }
}

