package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void when142Then4() {
        MultiMax mMax = new MultiMax();
        int result = mMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int second = 42;
        int first = second + 1;
        int third = second - 1;
        MultiMax mMax = new MultiMax();
        int result = mMax.max(first, second, third);
        assertThat(result, is(first));
    }

    @Test
    public void whenSecondMax() {
        int first = 42;
        int second = first + 1;
        int third = first - 1;
        MultiMax mMax = new MultiMax();
        int result = mMax.max(first, second, third);
        assertThat(result, is(second));
    }

    @Test
    public void whenThirdMax() {
        int third = 42;
        int second = third - 2;
        int first = third - 1;
        MultiMax mMax = new MultiMax();
        int result = mMax.max(first, second, third);
        assertThat(result, is(third));
    }

    @Test
    public void whenEqualThenThree() {
        MultiMax mMax = new MultiMax();
        int result = mMax.max(3, 3, 3);
        assertThat(result, is(3));
    }
}
