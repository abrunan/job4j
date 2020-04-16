package ru.job4j.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {
    @Test
    public void when2to2ArrayThenList4() {
        ConvertMatrix2List convert = new ConvertMatrix2List();
        int[][] array = {
                {1, 2},
                {3, 4}
        };
        List<Integer> result = convert.toList(array);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4);
        assertThat(result, is(expect));
    }

    @Test
    public void when3to3ArrayThenList6() {
        ConvertMatrix2List convert = new ConvertMatrix2List();
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {4, 5, 6}
        };
        List<Integer> result = convert.toList(array);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 4, 5, 6);
        assertThat(result, is(expect));
    }
}
