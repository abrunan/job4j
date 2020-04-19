package ru.job4j.collections;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UniqueTextTest {
	@Test
	public void whenSameTextsThenTrue() {
		String origin = "Bruh, what's going on?";
		String text = "Bruh, what's going on?";
		assertThat(UniqueText.isEqual(origin, text), is(true));
	}

	@Test
	public void whenDiffTextsThenFalse() {
		String origin = "Bruh, what's going on?";
		String text = "What's up, bro?";
		assertThat(UniqueText.isEqual(origin, text), is(false));
	}
}
