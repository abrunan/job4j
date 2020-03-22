package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {

    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number can not be less than 0");
        }
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
