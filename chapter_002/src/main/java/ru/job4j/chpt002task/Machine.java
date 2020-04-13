package ru.job4j.chpt002task;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = new int[] {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int amount = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (amount >= COINS[i]) {
                amount -= COINS[i];
                rsl[size++] = COINS[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
