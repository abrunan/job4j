package ru.job4j.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PaintTest {
    private final PrintStream sdtOut = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("Execute before test");
        System.setOut(new PrintStream(out));
    }

    @After
    public void backOutput() {
        System.out.println("Execute after test");
        System.setOut(sdtOut);
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("*********")
                                .add("*       *")
                                .add("*       *")
                                .add("*       *")
                                .add("*********")
                                .toString()
                ));
        System.setOut(sdtOut);
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("     *")
                                .add("   *   *")
                                .add(" *       *")
                                .add("***********")
                                .toString()
                ));
        System.setOut(sdtOut);
    }
}
