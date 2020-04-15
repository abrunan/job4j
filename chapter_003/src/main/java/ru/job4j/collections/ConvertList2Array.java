package ru.job4j.collections;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] rsl = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            rsl[row][cell] = num;
            if (cell == cells - 1) {
                row++;
                cell = 0;
            } else {
                cell++;
            }
        }
        return rsl;
    }
}
