package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author abrunan
 * @version 1
 * @since 09.03.2019
 */
public class CalculateTest {

    /**
     * Testing method echo(String);
     */

    @Test
    public void whenTakeNameThenThreeEchoPlusName() {
        String input = "Hunan Abrahamyan";
        String expect = "Echo, echo, echo : Hunan Abrahamyan";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }

    /**
     * Testing method add(double, double)
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculate calc = new Calculate();
        double result = calc.add(1d, 1d);
        double expect = 2d;
        assertThat(result, is(expect));
    }

    /**
     * Testing method substract (double, double)
     */
    @Test
    public void whenThreeMinusOneThenTwo() {
        Calculate calc = new Calculate();
        double result = calc.substract(3d, 1d);
        double expect = 2d;
        assertThat(result, is(expect));
    }

    /**
     * Testing method div(double, double)
     */
    @Test
    public void whenSixDivByThreeThenTwo() {
        Calculate calc = new Calculate();
        double result = calc.div(6d, 3d);
        double expect = 2d;
        assertThat(result, is(expect));
    }

    /**
     * Testing method multiply(double, double)
     */
    @Test
    public void whenTwoMultiplyByOneThenTwo() {
        Calculate calc = new Calculate();
        double result = calc.multiply(2d, 1d);
        double expect = 2d;
        assertThat(result, is(expect));
    }
}
