package ru.job4j.loop;

/**
 * @author Hunan Abrahamyan (abrunan@yandex.ru)
 * @version $Id$
 */

public class Paint {
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;

        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                if (column <= row)
                    screen.append("^");
                else
                    screen.append(" ");
            }
            screen.append(System.lineSeparator());
        }

        return screen.toString();
    }

    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;

        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                if (column >= width - row - 1)
                    screen.append("^");
                else
                    screen.append(" ");
            }
            screen.append(System.lineSeparator());
        }

        return screen.toString();
    }

    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width = 2 * height - 1;

        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                if (column >= height - row -1 && column <= height + row - 1)
                    screen.append("^");
                else
                    screen.append(" ");
            }
            screen.append(System.lineSeparator());
        }

        return screen.toString();
    }

}
