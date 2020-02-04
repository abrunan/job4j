package ru.job4j.array;

public class Turn {

    public int[] back(int[] data) {
        int lng = data.length;
        for (int i = 0; i < lng / 2; i++) {
            int tmp = data[i];
            data[i] = data[lng - 1 - i];
            data[lng - 1 - i] = tmp;
        }
        return data;
    }
}
