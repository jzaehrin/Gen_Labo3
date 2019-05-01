package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoSquareTest {

    @Test
    void goSquareShouldHaveAName() {
        String name = "GoSquare";

        Square square = new GoSquare(name);

        assertEquals(square.getName(), name);
    }

    @Test
    void netWorthHasChanged() {
        Board board = new Board();
        Cup cup = new Cup();
        cup.addDie(new Die());
        cup.addDie(new Die());
        Player player = new Player("Player", board, cup);

        String name = "GoSquare";
        Square square = new GoSquare(name);
        int w = player.getNetWorth();
        player.getPiece().setLocation(square);
        square.landedOn(player);
        int afterGo = player.getNetWorth() - 200;
        assertEquals(afterGo, w);
    }

    @Test
    void goSquareIsLandedOn() {
        Board board = new Board();
        Cup cup = new Cup();
        cup.addDie(new Die());
        cup.addDie(new Die());
        Player player = new Player("Player", board, cup);

        String name = "GoSquare";
        Square square = new GoSquare(name);
        player.getPiece().setLocation(square);
        assertTrue(square.landedOn(player));

    }
}
