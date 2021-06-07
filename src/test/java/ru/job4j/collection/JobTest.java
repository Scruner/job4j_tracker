package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByNameAndPriorityIncrease() {
        Comparator<Job> cmpNamePriority = new JobIncreaseByName()
                .thenComparing(new JobIncreaseByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityDecrease() {
        Comparator<Job> cmpNamePriority = new JobDecreaseByName()
                .thenComparing(new JobDecreaseByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndNameIncrease() {
        Comparator<Job> cmpNamePriority = new JobIncreaseByPriority()
                .thenComparing(new JobIncreaseByName());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndNameDecrease() {
        Comparator<Job> cmpNamePriority = new JobDecreaseByPriority()
                .thenComparing(new JobDecreaseByName());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void testNameLessThan() {
        List<Job> jobs = Arrays.asList(new Job("o1"), new Job("o2"));
        Collections.sort(jobs, new JobDecreaseByName());
        List<Job> expected = List.of(new Job("o2"), new Job("o1"));
        assertEquals(jobs, expected);
    }

    @Test
    public void testNameMoreThan() {
        List<Job> jobs = Arrays.asList(new Job("o1"), new Job("o2"));
        Collections.sort(jobs, new JobIncreaseByName());
        List<Job> expected = List.of(new Job("o1"), new Job("o2"));
        assertEquals(jobs, expected);
    }

    @Test
    public void testPriorityLessThan() {
        List<Job> jobs = Arrays.asList(new Job(1), new Job(2));
        Collections.sort(jobs, new JobDecreaseByPriority());
        List<Job> expected = List.of(new Job(2), new Job(1));
        assertEquals(jobs, expected);
    }

    @Test
    public void testPriorityMoreThan() {
        List<Job> jobs = Arrays.asList(new Job(1), new Job(2));
        Collections.sort(jobs, new JobIncreaseByPriority());
        List<Job> expected = List.of(new Job(1), new Job(2));
        assertEquals(jobs, expected);
    }
}