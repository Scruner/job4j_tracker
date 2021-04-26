package ru.job4j.oop;

public class College {

    public static void main(String[] args) {
        Freshman freshman = new Freshman();
       /* Приведение к типу родителя Student*/
        Student stFreshman = freshman;
        /* Приведение к типу родителя Object*/
        Object oFreshman = freshman;
        /* Приведение при создании объекта*/
        Object objFreshman = new Freshman();
    }
}
