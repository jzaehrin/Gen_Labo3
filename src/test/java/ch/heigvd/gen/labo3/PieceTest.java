package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {
    @Test
    void pieceShouldHaveAName() {
        String name = "toto";

        Piece piece = new Piece(name);

        assertEquals(piece.getName(), name);
    }
}
