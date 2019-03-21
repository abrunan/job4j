package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class TriangleTest {

    @Test
    public void whenAreaSetThreePointsThenArea() {
        Triangle triangle = new Triangle();
        double result = triangle.area(0, 0, 0, 2, 2, 0);
        double expect = 2D;
        assertThat(result, closeTo(expect, 0.1));
    }
}
