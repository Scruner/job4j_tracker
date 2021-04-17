package ru.job4j.oop;

public class Doctor extends Profession {

    private String specialization;

    public Doctor(
            String name, String surname, String education,
            String birthday, String specialization) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
    }

    public Doctor(String name, String surname) {
        super(name, surname);
    }
}

class Surgeon extends Doctor {

    private String section;
    private Surgeon complexity;

    public Surgeon(
            String name, String surname, String education,
            String birthday, String specialization, String section, Surgeon complexity) {
        super(name, surname, education, birthday, specialization);
        this.section = section;
        this.complexity = complexity;
    }

    public Surgeon operation(String organ, int time) {
        return complexity;
    }
}

class Dentist extends Doctor {

    private String experience;

    public Dentist(
            String name, String surname, String education,
            String birthday, String specialization, String experience) {
        super(name, surname, education, birthday, specialization);
        this.experience = experience;
    }

    public boolean dentalFilling(String material, int price) {
        return false;
    }
}

class Diagnosis extends Doctor {

    private String diagnosis;

    public Diagnosis(
            String name, String surname, String education,
            String birthday, String specialization, String diagnosis) {
        super(name, surname, education, birthday, specialization);
        this.diagnosis = diagnosis;
    }

    public String heal(Pacient pacient) {
        return diagnosis;
    }
}

class Pacient extends Doctor {

    private String disease;
    private String age;

    public Pacient(
            String name, String surname,
            String disease, String age) {
        super(name, surname);
    }

    public boolean takingMedication(String medication) {
        return false;
    }
}