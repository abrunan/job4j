package strategy;

import org.junit.Test;
import ru.job4j.strategy.Square;

import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square sq = new Square();
        assertThat(sq.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("*********")
                                .add("*       *")
                                .add("*       *")
                                .add("*       *")
                                .add("*********")
                                .toString()
                ));
    }
}
