package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ValidateInputTest {
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
    public void whenInvalidInput() {
        String[] data = {"one", "1"};
        ValidateInput input = new ValidateInput(
                new StubInput(data)
        );
        input.askInt("Enter number");
        assertThat(
                out.toString(),
                is(String.format("It is not a number. Please enter again.%n"))
        );
    }

    @Test
    public void whenOutOfBounds() {
        String[] data = {"7", "1"};
        ValidateInput input = new ValidateInput(
                new StubInput(data)
        );
        input.askInt("Enter number", 6);
        assertThat(
                out.toString(),
                is(String.format("The number is out of bounds. Please enter again.%n"))
        );
    }
}
