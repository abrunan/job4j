package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Tracker class
 */
public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    private String generateId() {
        Random rand = new Random();
        return String.valueOf(rand.nextLong() + System.currentTimeMillis());
    }


    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] res = new Item[position];
        int size = 0;
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(key)) {
                res[size++] = items[i];
            }
        }
        return Arrays.copyOf(res, size);
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(String id) {
        int result = -1;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean found = index != -1;
        if (found) {
            item.setId(id);
            items[index] = item;
        }
        return found;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        boolean found = index != -1;
        if (found) {
            int size = position - index;
            System.arraycopy(items, index + 1, items, index, size);
            items[position - 1] = null;
            position--;
        }
        return found;
    }
}
