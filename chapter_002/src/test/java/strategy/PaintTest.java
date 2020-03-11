package strategy;

import org.junit.Test;
import ru.job4j.strategy.Paint;
import ru.job4j.strategy.Square;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PaintTest {
    @Test
    public void whenPaintSquare() {
        PrintStream sdtOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
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
}
