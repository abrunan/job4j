package ru.job4j.chpt002task;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEqualsThenEmpty() {
        Machine machine = new Machine();
        int[] expect = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is (expect));
    }

    @Test
    public void when50by35Then15() {
        Machine machine = new Machine();
        int[] expect = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is (expect));
    }

    @Test
    public void when50by38Then12() {
        Machine machine = new Machine();
        int[] expect = {10, 2};
        int[] rsl = machine.change(50, 38);
        assertThat(rsl, is (expect));
    }
}
