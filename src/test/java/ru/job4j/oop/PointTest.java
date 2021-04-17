package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PointTest extends TestCase {

    @Test
    public void when00to20then2() {
        int x = 0;
        int y = 0;
        int expected = 2;
        double out = Point.distance(x, y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when84to23then2() {
        int x = 8;
        int y = 4;
        double expected = 6.08;
        double out = Point.distance(x, y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to72then2() {
        int x = 2;
        int y = 5;
        double expected = 5.83;
        double out = Point.distance(x, y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when357to72then3() {
        int x = 3;
        int y = 5;
        int z = 7;
        double expected = 5.83;
        double out = Point.distance3d(x, y, z);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when148to72then3() {
        int x = 1;
        int y = 4;
        int z = 8;
        double expected = 5.83;
        double out = Point.distance3d(x, y, z);
        Assert.assertEquals(expected, out, 0.01);
    }
}