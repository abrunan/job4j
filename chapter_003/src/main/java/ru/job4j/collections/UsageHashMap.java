package ru.job4j.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsageHashMap {
	public static void main(String[] args) {
		Map<String, String> users = new HashMap<>();
		users.put("abrunan@yandex.ru", "Unan Abraamyan");
		users.put("bcipher@gfalls.net", "Bill Cipher");
		users.put("scooper@bbang.com", "Sheldon Cooper");

		for (String userMail : users.keySet()) {
			String value = users.get(userMail);
			System.out.println(userMail + " " + value);
		}
	}
}
