package ru.job4j.collections;

import java.util.Objects;

public class Citizen {
	private String username;
	private String passport;

	public Citizen(String username, String passport) {
		this.username = username;
		this.passport = passport;
	}

	public String getUsername() {
		return username;
	}

	public String getPassport() {
		return passport;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Citizen citizen = (Citizen) o;
		return passport.equals(citizen.passport);
	}

	@Override
	public int hashCode() {
		return Objects.hash(passport);
	}
}
