package ru.job4j.collections;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
	public static HashMap<String, Order> process(List<Order> orders) {
		HashMap<String, Order> res = new HashMap<>();
		for (Order order : orders) {
			res.put(order.getNumber(), order);
		}
		return res;
	}
}
