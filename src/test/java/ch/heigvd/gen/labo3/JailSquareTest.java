package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JailSquareTest {
    @Test
    void jailSquareShouldHaveAName() {
        String name = "JailSquare";

        Square square = new JailSquare(name);

        assertEquals(square.getName(), name);
    }

    @Test
    void netWorthHasNotChanged() {
        Board board = new Board();
        Cup cup = new Cup();
        cup.addDie(new Die());
        cup.addDie(new Die());
        Player player = new Player("Player", board, cup);

        String name = "Jail";
        Square square = new JailSquare(name);
        player.getPiece().setLocation(square);
        assertTrue(square.landedOn(player));
    }
}