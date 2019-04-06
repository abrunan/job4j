package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TurnTest {

    @Test
    public void whenOdd123Then321() {
        Turn turn = new Turn();
        int[] result = turn.back(new int[]{1, 2, 3});
        int[] expect = new int[]{3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenEven1989Then9891() {
        Turn turn = new Turn();
        int[] result = turn.back(new int[]{1, 9, 8, 9});
        int[] expect = new int[]{9, 8, 9, 1};
        assertThat(result, is(expect));
    }
}
