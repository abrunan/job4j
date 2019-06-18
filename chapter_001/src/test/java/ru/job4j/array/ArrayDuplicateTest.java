package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

public class ArrayDuplicateTest {

    @Test
    public void whenRemoveThenArrayWithoutDup() {
        ArrayDuplicate arrDup = new ArrayDuplicate();
        String[] input = {"1", "1", "1", "3", "4", "1"};
        String[] result = arrDup.remove(input);
        String[] expect = {"1", "3", "4"};

        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}