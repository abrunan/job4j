package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test
* 
* @author abrunan
* @since 09.03.2019
* @version 1
*/
public class CalculateTest {
	
	/**
	* Testing method echo(String name);
	*/
	
	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
		String input = "Hunan Abrahamyan";
		String expect = "Echo, echo, echo : Hunan Abrahamyan";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
	
}
