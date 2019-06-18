package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Hunan Abrahamyan (abrunan@yandex.ru)
 * @version $Id$
 */

public class Paint {

    public String loopBy(int height, int width, BiPredicate<Integer, Integer> predicate) {
        StringBuilder screen = new StringBuilder();

        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                if (predicate.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }

        return screen.toString();
    }

    public String rightTrl(int height) {
        return loopBy(
                height,
                height,
                (row, column) -> column <= row
        );
    }

    public String leftTrl(int height) {
        return loopBy(
                height,
                height,
                (row, column) -> column >= height - row - 1
        );
    }

    public String pyramid(int height) {
        return loopBy(
                height,
                2 * height - 1,
                (row, column) -> column >= height - row - 1 && column <= height + row - 1
        );
    }

}
