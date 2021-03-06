package ru.job4j.calculate;

/**
 * Class Calculate
 * This class is for arithmetic operations: + - * / ^.
 *
 * @author abrunan
 * @version 1
 * @since 06.03.2019
 */
public class Calculate {

    /**
     * Method add
     *
     * @param first and second - two variables of type double
     * @return a sum of two variables
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Method substract
     *
     * @param first and second - two variables of type double
     * @return a residual
     */
    public double substract(double first, double second) {
        return first - second;
    }

    /**
     * Method div
     *
     * @param first and second - two variables of type double
     * @return quotient
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Method multiply
     *
     * @param first and second - two variables of type double
     * @return product
     */
    public double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Method echo
     *
     * @param name is a String to be echoed
     * @return Echo plus name
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }

}
