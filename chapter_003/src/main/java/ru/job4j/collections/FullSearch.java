package ru.job4j.collections;

import java.util.*;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> tasks) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : tasks) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
