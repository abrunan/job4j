package ru.job4j.collections;

import java.util.Objects;

public class Order {
	private String number;
	private String name;

	public Order(String number, String name) {
		this.number = number;
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Order{" +
				"name='" + name + '\'' +
				", number='" + number + '\'' +
				'}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Order order = (Order) o;
		return name.equals(order.name) &&
				number.equals(order.number);
	}
}
