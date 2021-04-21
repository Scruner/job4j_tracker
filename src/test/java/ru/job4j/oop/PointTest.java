package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point point = new Point(0, 0);
        Point that = new Point(0, 2);
        int expected = 2;
        double out = point.distance(that);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when84to32then2() {
        Point point = new Point(8, 4);
        Point that = new Point(3, 2);
        double expected = 5.38;
        double out = point.distance(that);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to72then2() {
        Point point = new Point(2, 5);
        Point that = new Point(7, 2);
        double expected = 5.83;
        double out = point.distance(that);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when357to721then3() {
        Point point = new Point(3, 5, 7);
        Point that = new Point(7, 2, 1);
        double expected = 7.81;
        double out = point.distance3d(that);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when148to459then3() {
        Point point = new Point(1, 2, 8);
        Point that = new Point(4, 5, 9);
        double expected = 4.36;
        double out = point.distance3d(that);
        Assert.assertEquals(expected, out, 0.01);
    }
}