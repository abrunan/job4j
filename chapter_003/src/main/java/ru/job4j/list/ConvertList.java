package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public List<Integer> toPlaneList(List<int[]> list) {
        List<Integer> res = new ArrayList<>();
        for (int[] array : list) {
            for (int num : array) {
                res.add(num);
            }
        }
        return res;
    }
}
