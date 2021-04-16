package ru.job4j.oop;

public class Engineer extends Profession {

}

class Builder extends Engineer {

    private String position;
    private Builder construction;

    public Builder building(String kind, int timeBuilding) {
        return construction;
    }
}

class Programmer extends Engineer {

    private String languages;
    private Programmer answer;

    public Programmer coding(String task, int time) {
        return answer;
    }
}