package ru.job4j.collections;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
	private Map<String, Citizen> citizens = new HashMap<>();

	public boolean add(Citizen citizen) {
		boolean res = false;
		String passport = citizen.getPassport();
		if (!citizens.containsKey(passport)) {
			citizens.put(passport, citizen);
			res = true;
		}
		return res;
	}

	public Citizen get(String passport) {
		return citizens.get(passport);
	}
}
