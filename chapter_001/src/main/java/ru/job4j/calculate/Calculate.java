package ru.job4j.calculate;

/**
* Class Calculate
* This class is for arithmetic operations: + - * / ^.
* @author abrunan
* @since 06.03.2019
* @version 1
*/
public class Calculate {
	
	/**
	* Method main() is the entry point to the application
	* @param args - an array of Strings passed from the console
	*/
	public static void main(String[] args) {
		System.out.println("Hello world");
	}

	/**
	 * Method add
	 * @param first and second - two variables of type double
	 * @return a sum of two variables
	 */
	public double add(double first, double second) {
		return first + second;
	}

	/**
	 * Method substract
	 * @param first and second - two variables of type double
	 * @return a residual
	 */
	public double substract(double first, double second) {
		return first - second;
	}

	/**
	 * Method div
	 * @param first and second - two variables of type double
	 * @return quotient
	 */
	public double div(double first, double second) {
		return first / second;
	}

	/**
	 * Method multiply
	 * @param first and second - two variables of type double
	 * @return product
	 */
	public double multiply(double first, double second) {
		return first * second;
	}

	/**
	* Method echo
	* @param name is a String to be echoed
	* @return Echo plus name
	*/
	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
	
}
