package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax4To3Then1() {
        int left = 4;
        int right = 3;
        int expected = left;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax3To4Then2() {
        int left = 3;
        int right = 4;
        int expected = right;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax3To3ThenEqual() {
        int left = 3;
        int right = 3;
        int expected = right;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenL3R3Cen4Then3() {
        int left = 3;
        int right = 3;
        int center = 4;
        int expected = center;
        int out = Max.max(left, right, center);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenL2R4Cen4Up5Then3() {
        int left = 2;
        int right = 4;
        int center = 7;
        int up = 5;
        int expected = center;
        int out = Max.max(left, right, center, up);
        Assert.assertEquals(expected, out);
    }
}