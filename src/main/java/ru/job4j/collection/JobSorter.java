package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {

    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Comparator<Job> comb = new JobIncreaseByName()
                .thenComparing(new JobIncreaseByPriority());
        Collections.sort(jobs, comb);
        System.out.println(jobs);

        Comparator<Job> comb2 = new JobDecreaseByName()
                .thenComparing(new JobDecreaseByPriority());
        Collections.sort(jobs, comb2);
        System.out.println(jobs);

        Comparator<Job> comb3 = new JobIncreaseByPriority()
                .thenComparing(new JobIncreaseByName());
        Collections.sort(jobs, comb3);
        System.out.println(jobs);

        Comparator<Job> comb4 = new JobDecreaseByPriority()
                .thenComparing(new JobDecreaseByName());
        Collections.sort(jobs, comb4);
        System.out.println(jobs);
    }
}
