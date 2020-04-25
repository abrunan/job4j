package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class BankServiceTest {
	@Test
	public void addUser() {
		User user = new User("4606", "Bill Cipher");
		BankService bank = new BankService();
		bank.addUser(user);
		assertThat(bank.findByPassport("4606"), is(user));
	}

	@Test
	public void whenEnterInvalidPassport() {
		User user = new User("4606", "Bill Cipher");
		BankService bank = new BankService();
		bank.addUser(user);
		bank.addAccount(user.getPassport(), new Account("5546", 150D));
		assertNull(bank.findByRequisite("34", "5546"));
	}

	@Test
	public void addAccount() {
		User user = new User("4606", "Bill Cipher");
		BankService bank = new BankService();
		bank.addUser(user);
		bank.addAccount(user.getPassport(), new Account("5546", 150D));
		assertThat(bank.findByRequisite("4606", "5546").getBalance(), is(150D));
	}

	@Test
	public void transferMoney() {
		User user = new User("4606", "Bill Cipher");
		BankService bank = new BankService();
		bank.addUser(user);
		bank.addAccount(user.getPassport(), new Account("5546", 150D));
		bank.addAccount(user.getPassport(), new Account("113", 50D));
		bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
		assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance(), is(200D));
	}
}
