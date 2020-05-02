package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemsSortTest {
	Item fix = new Item("Fix bugs");
	Item reboot = new Item("Reboot server");
	Item impl = new Item("Impl task");
	Item resolve = new Item("Resolve incident");

	List<Item> items = Arrays.asList(resolve, fix, reboot, impl);

	@Test
	public void whenSortAsc() {
		Collections.sort(items, new CompareItemByNameAsc());
		assertThat(items, is(
				new ArrayList<>(
						Arrays.asList(fix, impl, reboot, resolve))));
	}

	@Test
	public void whenSortDesc() {
		Collections.sort(items, new CompareItemByNameDesc());
		assertThat(items, is(
				new ArrayList<>(
						Arrays.asList(resolve, reboot, impl, fix))));
	}
}
