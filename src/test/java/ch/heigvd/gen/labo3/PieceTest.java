package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {
    @Test
    void pieceShouldHaveAName() {
        String name = "toto";
        Square square = new RegularSquare("toto");

        Piece piece = new Piece(name, square);

        assertEquals(piece.getName(), name);
    }


    @Test
    void pieceShouldHaveLocation(){
        String name = "toto";
        Square square = new RegularSquare("square 1");

        Piece piece = new Piece(name, square);

        assertEquals(piece.getLocation(), square);
    }

    @Test
    void pieceLocationShouldHaveChanged(){
        String name = "toto";
        Square square = new RegularSquare("square 1");
        Square newSquare = new RegularSquare("square 2");

        Piece piece = new Piece(name, square);

        piece.setLocation(newSquare);

        assertEquals(piece.getLocation(), newSquare);
    }
}
