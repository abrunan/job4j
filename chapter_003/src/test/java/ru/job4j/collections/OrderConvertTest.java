package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OrderConvertTest {
	@Test
	public void whenSingleOrder() {
		List<Order> list = new ArrayList<>();
		list.add(new Order("3ef12", "Wireless mouse"));
		HashMap<String, Order> res = OrderConvert.process(list);
		assertThat(res.get("3ef12"), is(new Order("3ef12", "Wireless mouse")));
	}

	@Test
	public void whenSeveralOrders() {
		List<Order> list = new ArrayList<>();
		list.add(new Order("3ef12", "Wireless mouse"));
		list.add(new Order("4ef13", "Monitor"));
		list.add(new Order("5ef14", "Socks"));
		HashMap<String, Order> res = OrderConvert.process(list);
		assertThat(res.get("4ef13"), is(new Order("4ef13", "Monitor")));
	}
}
