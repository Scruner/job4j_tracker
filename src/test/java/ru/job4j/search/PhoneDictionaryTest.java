package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev",
                              "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByUsername() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Alexey", "Vedenistov",
                              "123456", "Nakhodka"));
        ArrayList<Person> persons = phones.find("Vedenistov");
        assertThat(persons.get(0).getName(), is("Alexey"));
    }

    @Test
    public void whenFindByPhone() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Ivan", "Ivanov",
                              "231254", "Moscow"));
        ArrayList<Person> persons = phones.find("231254");
        assertThat(persons.get(0).getAddress(), is("Moscow"));
    }

    @Test
    public void whenFindByNothing() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Roma", "Romanov",
                              "098300", "Kaluga"));
        ArrayList<Person> persons = phones.find("000445");
        assertThat(persons.isEmpty(), is(true));
    }
}