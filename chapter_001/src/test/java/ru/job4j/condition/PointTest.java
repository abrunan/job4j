package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void whenZeroAndTenThenTen() {
        Point point0 = new Point(0,0);
        Point point1 = new Point(0,10);
        double result = point0.distance(point1);
        double expect = 10D;
        assertThat(result, is(expect));
    }
    @Test
    public void whenZeroAndTenThenTen3d() {
        Point point0 = new Point(0,0, 0);
        Point point1 = new Point(0,0, 10);
        double result = point0.distance3d(point1);
        double expect = 10D;
        assertThat(result, is(expect));
    }
}
