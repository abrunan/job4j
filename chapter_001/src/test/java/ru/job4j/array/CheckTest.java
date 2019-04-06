package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckTest {

    @Test
    public void whenAllTrueThenTrue() {
        Check ch = new Check();
        boolean result = ch.mono(new boolean[]{true, true, true});
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenDifferentThenFalse() {
        Check ch = new Check();
        boolean result = ch.mono(new boolean[]{true, true, false, true});
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
