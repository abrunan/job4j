package ru.job4j.converter;

/**
 * Class Converter
 *
 * @author abrunan
 * @version 1
 * @since 06.03.2019
 */

public class Converter {

    /**
     * Convert rubles to euros
     *
     * @param value to be converted
     * @return euros
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Convert rubles to USD
     *
     * @param value to be converted
     * @return dollars
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Convert euros to rubles
     *
     * @param value to be converted
     * @return rubles
     */
    public int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Convert US dollars to rubles
     *
     * @param value to be converted
     * @return rubles
     */
    public int dollarToRuble(int value) {
        return value * 60;
    }

}
