package ru.job4j.pojo;

import java.time.format.DateTimeFormatter;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Vedenistov");
        student.setName("Alexey");
        student.setMiddleName("Olegovish");
        student.setGroupId(5);
        student.setAdmissionDate();
        System.out.println("Student surname: " + student.getSurname()
                + System.lineSeparator() + "Student name: " + student.getName()
                + System.lineSeparator() + "Student middleName: " + student.getMiddleName()
                + System.lineSeparator() + "Student groupeId: " + student.getGroupId()
                + System.lineSeparator() + "Student admissionDate: " + student.getAdmissionDate()
                .format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss")));
    }
}
