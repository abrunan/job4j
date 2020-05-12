package ru.job4j.collections;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
	@Override
	public int compare(String left, String right) {
		int leftNumber = Integer.parseInt(left, 0, left.indexOf('.'),10);
		int rightNumber = Integer.parseInt(right, 0, right.indexOf('.'),10);

		return Integer.compare(leftNumber, rightNumber);
	}
}
