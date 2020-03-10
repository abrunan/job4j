package ru.job4j.converter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for Converter
 *
 * @author abrunan
 * @version 1
 * @since 09.03.2019
 */

public class ConverterTest {

    /**
     * Test
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter conv = new Converter();
        int result = conv.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter conv = new Converter();
        int result = conv.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test
     */
    @Test
    public void when1EuroToRubleThen70() {
        Converter conv = new Converter();
        int result = conv.euroToRuble(1);
        assertThat(result, is(70));
    }

    /**
     * Test
     */
    @Test
    public void when1DollarToRubleThen60() {
        Converter conv = new Converter();
        int result = conv.dollarToRuble(1);
        assertThat(result, is(60));
    }

}
