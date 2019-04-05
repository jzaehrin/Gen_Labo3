package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    @Test
    void shouldReturnStartPoint() {
        Board board = new Board();

        assertEquals("square#0", board.getSquare().getName());
    }
}
