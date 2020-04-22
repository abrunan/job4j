package ru.job4j.loop;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {

    @Ignore
    @Test
    public void when3x3() {
        Board board = new Board();
        String result = board.paint(3, 3);
        String ls = System.lineSeparator();
        String expect = String.format("X X%s X %sX X%s", ls, ls, ls);
        assertThat(result, is(expect));
    }
}
