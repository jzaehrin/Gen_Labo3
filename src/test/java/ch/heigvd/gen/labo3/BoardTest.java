package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    @Test
    void shouldReturnStartPoint() {
        Board board = new Board();

        assertEquals("square#0", board.getSquare().getName());
    }

    @Test
    void shouldGiveNextStep() {
        Board board = new Board();
        Square current = board.getSquare();

        for(Integer i = 1; i < 40; ++i) {
            current = board.getSquare(current, 1);

            assertEquals(current.getName(), new String("square#") + i.toString());
        }
    }

    @Test
    void shouldGiveNextStepAtEnd() {
        Board board = new Board();
        Square current = board.getSquare();

        current = board.getSquare(current, 39);
        assertEquals(current.getName(), "square#39");

        current = board.getSquare(current, 1);
        assertEquals(current.getName(), "square#0");

    }
}
