package ru.job4j.chpt002task;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = new int[] {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int amount = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (amount > 0) {
                if (amount - COINS[i] >= 0) {
                    amount -= COINS[i];
                    rsl[size++] = COINS[i];
                } else break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
