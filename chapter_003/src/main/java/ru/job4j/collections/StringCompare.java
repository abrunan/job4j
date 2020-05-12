package ru.job4j.collections;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
	@Override
	public int compare(String left, String right) {
		int res = 0;
		int index = 0;
		while (index < left.length() && index < right.length() && res == 0) {
			res = Character.compare(left.charAt(index), right.charAt(index));
			index++;
		}
		return res == 0 ? Integer.compare(left.length(), right.length()) : res;
	}
}
