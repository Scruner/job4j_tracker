package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MatrixListTest {

    @Test
    public void whenCollectArrayToList() {
        Integer[][] numbers = {{2, 3},
                               {4, 5}};
        MatrixList matrixList = new MatrixList();
        List<Integer> rsl = matrixList.collect(numbers);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertThat(rsl, is(expected));
    }
}