package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is (2));
    }

    @Test
    public void whenFirstMaxThenFirst() {
        int second = 42;
        int first = second + 1;
        Max max = new Max();
        int result = max.max(first, second);
        assertThat(result, is (first));
    }

    @Test
    public void whenSecondMaxThenSecond() {
        int first = 42;
        int second = first + 1;
        Max max = new Max();
        int result = max.max(first, second);
        assertThat(result, is (second));
    }

    @Test
    public void whenEqualThenBoth() {
        Max max = new Max();
        int result = max.max(2, 2);
        assertThat(result, is (2));
    }

}
