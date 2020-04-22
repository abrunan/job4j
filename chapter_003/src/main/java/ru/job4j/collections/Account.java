package ru.job4j.collections;

import java.util.Objects;

public class Account {
	private String passport;
	private String username;
	private String accNumber;

	public Account(String passport, String username, String accNumber) {
		this.passport = passport;
		this.username = username;
		this.accNumber = accNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Account account = (Account) o;
		return passport.equals(account.passport);
	}

	@Override
	public int hashCode() {
		return Objects.hash(passport);
	}

	@Override
	public String toString() {
		return "Account{" +
				"passport='" + passport + '\'' +
				", username='" + username + '\'' +
				", accNumber='" + accNumber + '\'' +
				'}';
	}
}
