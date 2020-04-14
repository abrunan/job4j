package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneBookTest {
    @Test
    public void whenFindByName() {
        PhoneBook phones = new PhoneBook();
        phones.add(
                new Person("Bill", "Cipher", "66613", "GravityFalls")
        );
        ArrayList<Person> result = phones.find("Bill");
        assertThat(result.get(0).getSurname(), is("Cipher"));
    }
}
