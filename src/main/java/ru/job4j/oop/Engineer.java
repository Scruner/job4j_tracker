package ru.job4j.oop;

public class Engineer extends Profession {

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }
}

class Builder extends Engineer {

    private String position;
    private Builder construction;

    public Builder(
            String name, String surname, String education,
            String birthday, String position, Builder construction) {
        super(name, surname, education, birthday);
        this.position = position;
        this.construction = construction;
    }

    public Builder building(String kind, int timeBuilding) {
        return construction;
    }
}

class Programmer extends Engineer {

    private String languages;
    private Programmer answer;

    public Programmer(
            String name, String surname, String education,
            String birthday, String languages, Programmer answer) {
        super(name, surname, education, birthday);
        this.languages = languages;
        this.answer = answer;
    }

    public Programmer coding(String task, int time) {
        return answer;
    }
}