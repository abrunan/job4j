package ru.job4j.chpt001task;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MergeMatrixTest {

    @Test
    public void when13and24Then1234() {
        MergeMatrix merMat = new MergeMatrix();
        int[] left = new int[] {1,3};
        int[] right = new int[] {2,4};
        int[] result = merMat.merge(left, right);
        int[] expect = {1, 2, 3, 4};

        assertThat(result, is(expect));
    }

    @Test
    public void when1356and44Then123456() {
        MergeMatrix merMat = new MergeMatrix();
        int[] left = new int[] {1,3, 5, 6};
        int[] right = new int[] {4,4};
        int[] result = merMat.merge(left, right);
        int[] expect = {1, 3, 4, 4, 5, 6};

        assertThat(result, is(expect));
    }
}