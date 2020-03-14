package ru.job4j.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrianleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle tr = new Triangle();
        assertThat(tr.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("     *")
                                .add("   *   *")
                                .add(" *       *")
                                .add("***********")
                                .toString()
                ));
    }
}
