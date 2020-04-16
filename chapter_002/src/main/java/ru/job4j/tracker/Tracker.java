package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Tracker class
 */
public class Tracker {

    private final List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    private String generateId() {
        Random rand = new Random();
        return String.valueOf(rand.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> res = new ArrayList<>();
        for (Item current : items) {
            if (current.getName().equals(key)) {
                res.add(current);
            }
        }
        return res;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(String id) {
        int res = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                res = i;
                break;
            }
        }
        return res;
    }

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean found = index != -1;
        if (found) {
            item.setId(id);
            items.set(index, item);
        }
        return found;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        boolean found = index != -1;
        if (found) {
            items.remove(index);
        }
        return found;
    }
}
