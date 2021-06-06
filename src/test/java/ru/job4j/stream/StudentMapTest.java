package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentMapTest {

    @Test
    public void whenCollectClassA() {
        List<Student> students = List.of(
                new Student("Surname1"),
                new Student("Surname4"),
                new Student("Surname4"),
                new Student("Surname5"),
                new Student("Surname7"),
                new Student("Surname7"),
                new Student("Surname7"),
                new Student("Surname9")
        );
        StudentMap sm = new StudentMap();
        List<Student> rsl = (List<Student>) sm.collect(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname1", new Student());
        expected.put("Surname4", new Student());
        expected.put("Surname5", new Student());
        expected.put("Surname7", new Student());
        expected.put("Surname9", new Student());
        assertThat(rsl, is(expected));
    }
}
