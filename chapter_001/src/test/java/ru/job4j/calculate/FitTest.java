package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {

    @Test
    public void whenManHeight180Then92() {
        Fit fit = new Fit();
        double result = fit.manWeight(180D);
        double expect = 92D;
        assertThat(result, closeTo(expect, 0.1D));
    }

    @Test
    public void whenWomanHeight170Then69() {
        Fit fit = new Fit();
        double result = fit.womanWeight(170D);
        double expect = 69D;
        assertThat(result, closeTo(expect, 0.1D));
    }
}
