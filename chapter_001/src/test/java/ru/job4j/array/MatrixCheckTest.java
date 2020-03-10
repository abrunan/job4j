package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenDataMono4ByTrueThenTrue() {
        MatrixCheck mch = new MatrixCheck();
        boolean[][] input = {
                {true, true, true, false},
                {true, true, false, true},
                {true, false, true, false},
                {false, false, true, true}
        };
        boolean result = mch.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck mch = new MatrixCheck();
        boolean[][] input = {
                {true, true, true},
                {true, true, false},
                {true, true, true}
        };
        boolean result = mch.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByTrueThenFalse() {
        MatrixCheck mch = new MatrixCheck();
        boolean[][] input = {
                {true, true, true},
                {true, false, false},
                {false, true, false}
        };
        boolean result = mch.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataMonoByTwoThenFalse() {
        MatrixCheck mch = new MatrixCheck();
        boolean[][] input = {
                {true, true},
                {true, false},
        };
        boolean result = mch.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataMonoByTwoThenTrue() {
        MatrixCheck mch = new MatrixCheck();
        boolean[][] input = {
                {false, true},
                {true, false},
        };
        boolean result = mch.mono(input);
        assertThat(result, is(true));
    }
}
