package ru.job4j.condition;

public class MultiMax {
    public int max(int x1, int x2, int x3) {
        int tmpMax = x1 > x2 ? x1 : x2;
        return tmpMax > x3 ? tmpMax : x3;
    }
}
