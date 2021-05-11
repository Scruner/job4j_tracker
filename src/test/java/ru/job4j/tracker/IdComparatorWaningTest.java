package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class IdComparatorWaningTest {
    public List<Item> list = new ArrayList<>();

    @Test
    public void testGreaterThan() {
        list.sort(new Comparator<Item>());
        assertThat(что ожидаем, что в реальности);
    }

}