package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class IdComparatorNatureTest {

    @Test
    public void testLessThan() {
        List<Item> items = Arrays.asList(new Item(1, "item1"), new Item(2, "item2"));
        Collections.sort(items, new IdComparatorNature());
        List<Item> expected = Arrays.asList(new Item(1, "item1"), new Item(2, "item2"));
        assertEquals(items, expected);
    }
}