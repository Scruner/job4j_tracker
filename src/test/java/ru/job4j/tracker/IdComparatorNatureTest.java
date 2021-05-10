package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IdComparatorNatureTest {
    public IdComparatorNature IdComparatorNature = new IdComparatorNature();

    @Test
    public void testLessThan() {

        Item item1 = new Item(1);
        Item item2 = new Item(2);
        int rsl = IdComparatorNature.compare(item1, item2);
        assertTrue("expected to be less than", rsl <= -1);
    }
}