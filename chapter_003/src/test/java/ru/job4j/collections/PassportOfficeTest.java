package ru.job4j.collections;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PassportOfficeTest {

	@Test
	public void whenAddOneThenContainsSame() {
		Citizen citizen = new Citizen("2f44a", "Bill Cipher");
		PassportOffice office = new PassportOffice();
		office.add(citizen);
		assertThat(office.get(citizen.getPassport()), is(citizen));
	}
}
