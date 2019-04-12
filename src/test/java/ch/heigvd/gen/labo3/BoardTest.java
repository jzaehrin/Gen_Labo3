package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    @Test
    void shouldReturnStartPoint() {
        Board board = new Board();

        assertEquals(0, board.indexOfSquare(board.getSquare()));
    }

    @Test
    void shouldGiveNextStep() {
        Board board = new Board();
        Square current = board.getSquare();

        for(Integer i = 1; i < 40; ++i) {
            current = board.getSquare(current, 1);

            assertEquals(i, board.indexOfSquare(current));
        }
    }

    @Test
    void shouldGiveNextStepAtEnd() {
        Board board = new Board();
        Square current = board.getSquare();

        current = board.getSquare(current, 39);
        assertEquals(39, board.indexOfSquare(current));

        current = board.getSquare(current, 1);
        assertEquals(0, board.indexOfSquare(current));
    }
}
