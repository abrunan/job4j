package ru.job4j.array;

public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        boolean result = true;
        final int lng = data.length;

        for (int i = 0; i < lng - 1; i++) {
            if ((data[i][i] != data[i + 1][i + 1])
				|| (data[i][lng - i - 1] != data[i + 1][lng - i - 2])) {
                result = false;
                break;
            }
        }

        return result;
    }
}
