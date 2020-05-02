package ru.job4j.collections;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.greaterThan;

public class UserTest {
	@Test
	public void whenAsc() {
		Set<User> users = new TreeSet<>();
		users.add(new User("Dipper", 12));
		users.add(new User("Bill", 30));
		users.add(new User("Bill", 31));
		Iterator<User> it = users.iterator();
		assertThat(it.next(), is(new User("Bill", 30)));
		assertThat(it.next(), is(new User("Bill", 31)));
		assertThat(it.next(), is(new User("Dipper", 12)));
	}

	@Test
	public void whenCompareBillVSDipper() {
		int res = new User("Dipper", 12)
				.compareTo(
						new User("Bill", 31)
				);
		assertThat(res, greaterThan(0));
	}
}