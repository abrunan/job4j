package ru.job4j.chpt001task;

public class MergeMatrix {
    /**
     * Merge two sorted matrix's
     *
     * @param left  - first matrix
     * @param right - second matrix
     * @return merged matrix
     */
    int[] merge(int[] left, int[] right) {
        int lengthL = left.length;
        int lengthR = right.length;
        int[] res = new int[lengthL + lengthR];

        int indL = 0;
        int indR = 0;
        while (indL < lengthL && indR < lengthR) {
            if (left[indL] <= right[indR]) {
                res[indL + indR] = left[indL];
                indL++;
            } else {
                res[indL + indR] = right[indR];
                indR++;
            }
        }
        while (indR < lengthR) {
            res[indL + indR] = right[indR];
            indR++;
        }
        while (indL < lengthL) {
            res[indL + indR] = left[indL];
            indL++;
        }
        return res;
    }
}
