package ru.job4j.tracker;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class IdComparatorWaningTest {

    @Test
    public void testGreaterThan() {
        List<Item> items = Arrays.asList(new Item(1, "item1"), new Item(2, "item2"));
        Collections.sort(items, new IdComparatorWaning());
        List<Item> expected = Arrays.asList(new Item(2, "item2"), new Item(1, "item1"));
        assertEquals(items, expected);
    }
}