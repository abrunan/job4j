package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class TriangleTest {

    @Test
    public void whenAreaSetThreePointsThenArea() {
        Triangle triangle = new Triangle(new Point(0,0),new Point(0,2),new Point(2,0));
        double result = triangle.area();
        double expect = 2D;
        assertThat(result, closeTo(expect, 0.1));
    }
}
