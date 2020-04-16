package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        ConvertList convert = new ConvertList();
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1});
        list.add(new int[] {2, 3});
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(convert.toPlaneList(list), is(expect));
    }
}
