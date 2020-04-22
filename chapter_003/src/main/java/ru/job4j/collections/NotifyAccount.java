package ru.job4j.collections;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
	public static HashSet<Account> send(List<Account> accounts) {
		HashSet<Account> res = new HashSet<>();
		for (Account current : accounts) {
			res.add(current);
		}
		return res;
	}
}
