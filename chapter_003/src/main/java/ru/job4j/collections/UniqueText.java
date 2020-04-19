package ru.job4j.collections;

import java.util.HashSet;
import java.util.Set;

public class UniqueText {
	public static boolean isEqual(String originText, String duplicateText) {
		boolean res = true;
		String[] origin = originText.split(" ");
		String[] text = duplicateText.split(" ");
		Set<String> check = new HashSet<>();
		for (String word : origin) {
			check.add(word);
		}
		for (String word : text) {
			if (!check.contains(word)) {
				res = false;
				break;
			};
		}
		return res;
	}
}
