package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    public double distance (int x1, int y1, int x2, int y2) {
        return sqrt(
                pow(x1 - x2, 2) +
                pow(y1 - y2, 2)
        );
    }
}
