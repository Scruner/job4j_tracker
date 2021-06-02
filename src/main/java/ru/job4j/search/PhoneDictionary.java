package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {

    private final ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person searchPerson : persons) {
            if (searchPerson.getName()
                    .contains(key)
                    || searchPerson.getSurname()
                    .contains(key)
                    || searchPerson.getPhone()
                    .contains(key)
                    || searchPerson.getAddress()
                    .contains(key)) {
                result.add(searchPerson);
            }
        }
        return result;
    }
}
