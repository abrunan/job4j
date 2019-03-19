package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(0, 0, 0, 10);
        double expect = 10D;
        assertThat(result, is(expect));
    }
}
