package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class IdComparatorWaningTest {
    public IdComparatorWaning idComparatorWaning = new IdComparatorWaning();

    @Test
    public void testGreaterThan() {
        Item item1 = new Item(2);
        Item item2 = new Item(1);
        int rsl = idComparatorWaning.compare(item1, item2);
        assertTrue("expected to be greater than", rsl >= 1);
    }

}