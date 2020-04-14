package ru.job4j.search;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Returns a list of all persons that contain key in any fields
     * @param key The key to search.
     * @return The list of persons found.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person current : this.persons) {
            if(current.getAddress().contains(key)
                    || current.getName().contains(key)
                    || current.getSurname().contains(key)
                    || current.getPhone().contains(key)
            ) {
                result.add(current);
            }
        }
        return result;
    }
}
