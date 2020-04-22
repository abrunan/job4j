package ru.job4j.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotifyAccountTest {
	@Test
	public void whenNoDups() {
		HashSet<Account> setOfAccs = new HashSet<>(
				Arrays.asList(
						new Account("460611", "Stanford Pines", "ef2346c85ab"),
						new Account("460512", "Bill Cipher", "ef2346d85ab")
				));
		List<Account> listOfAccs = Arrays.asList(
				new Account("460611", "Stanford Pines", "ef2346c85ab"),
				new Account("460512", "Bill Cipher", "ef2346d85ab")
		);
		assertThat(NotifyAccount.send(listOfAccs), is(setOfAccs));
	}
	@Test
	public void whenHasDups() {
		List<Account> listOfAccs = Arrays.asList(
				new Account("460611", "Stanford Pines", "ef2346c85ab"),
				new Account("460512", "Bill Cipher", "ef2346d85ab"),
				new Account("460512", "Bill Cipher", "ed1346e85ab")
		);
		HashSet<Account> setOfAccs = new HashSet<>(
				Arrays.asList(
						new Account("460611", "Stanford Pines", "ef2346c85ab"),
						new Account("460512", "Bill Cipher", "ef2346d85ab")
				));
		assertThat(NotifyAccount.send(listOfAccs), is(setOfAccs));
	}
}
