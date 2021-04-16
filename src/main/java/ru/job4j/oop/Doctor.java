package ru.job4j.oop;

public class Doctor extends Profession {

}

class Surgeon extends Doctor {

    private String section;
    private Surgeon complexity;

    public Surgeon operation(String organ, int time) {
        return complexity;
    }
}

class Dentist extends Doctor {

    private String experience;

    public boolean dentalFilling(String material, int price) {
        return false;
    }
}

class Diagnosis extends Doctor {

    private String diagnosis;

    public String heal(Pacient pacient) {
        return diagnosis;
    }
}

class Pacient extends Doctor {

    private String disease;
    private String age;

    public boolean takingMedication(String medication) {
        return false;
    }
}