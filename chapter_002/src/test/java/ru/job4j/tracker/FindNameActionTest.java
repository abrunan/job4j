package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

public class FindNameActionTest {
    private final PrintStream sdtOut = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void backOutput() {
        System.setOut(sdtOut);
    }

    @Test
    public void whenCheckOutput() {
        Tracker tracker = new Tracker();
        Item item = new Item("Bruh");
        tracker.add(item);
        FindNameAction act = new FindNameAction();
        act.execute(new StubInput(new String[] {"Bruh"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(act.name())
                .add(item.getId() + ": " + item.getName())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));

    }
}
