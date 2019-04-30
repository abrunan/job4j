package ru.job4j.chpt001task;

public class MergeMatrix {
    int[] merge(int[] left, int[] right) {
        int lengthL = left.length;
        int lengthR = right.length;
        int[] result = new int[lengthL + lengthR];

        int indL = 0;
        int indR = 0;

        while (indL < lengthL && indR < lengthR) {
            if(left[indL] <= right[indR]) {
                result[indL + indR] = left[indL];
                indL++;
            } else {
                result[indL + indR] = right[indR];
                indR++;
            }
        }

        if (indL >= lengthL) {
            while(indR < lengthR) {
                result[indL + indR] = right[indR];
                indR++;
            }
        } else if (indR >= lengthR) {
            while(indL < lengthL) {
                result[indL + indR] = left[indL];
                indL++;
            }
        }
        return result;
    }
}
