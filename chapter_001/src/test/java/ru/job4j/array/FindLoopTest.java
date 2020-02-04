package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void when5Then0() {
        FindLoop fl = new FindLoop();
        int[] arr = new int[] {5, 5, 5};
        int result = fl.indexOf(arr, 5);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void when5ThenNone() {
        FindLoop fl = new FindLoop();
        int[] arr = new int[] {5, 5, 5};
        int result = fl.indexOf(arr, 6);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
