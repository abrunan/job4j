package ru.job4j.collections;

import java.util.HashSet;
import java.util.Set;

public class UsageHashSet {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("Lada");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Toyota");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
