package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BubbleSortTest {

    @Test
    public void whenSortArrayTenThenSortedArray() {
        BubbleSort bs = new BubbleSort();
        int[] data = {6, 4, 5, 7, 1, 10, 0, 8, 8, 8};
        data = bs.sort(data);
        int[] expect = {0, 1, 4, 5, 6, 7, 8, 8, 8, 10};
        assertThat(data, is(expect));
    }

}
