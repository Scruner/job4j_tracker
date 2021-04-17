package ru.job4j.inheritance;

public class TextReport {

    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}

class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator()
                + "\"name\"" + " : " + "\"name\"" + ","
                + System.lineSeparator()
                + "\"body\"" + " : " + "\"body\""
                + System.lineSeparator()
                + "}";
    }
}
