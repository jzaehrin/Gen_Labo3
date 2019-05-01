package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {
    @Test
    void goToJailSquareShouldHaveAName() {
        String name = "GoToJailSquare";

        Square square = new GoToJail(name);

        assertEquals(square.getName(), name);
    }

    @Test
    void netWorthHasNotChanged() {
        Board board = new Board();
        Cup cup = new Cup();
        cup.addDie(new Die());
        cup.addDie(new Die());
        Player player = new Player("Player", board, cup);

        String name = "GoToJail";
        Square square = new GoToJail(name);
        int w = player.getNetWorth();
        player.getPiece().setLocation(square);
        square.landedOn(player);
        int afterGo = player.getNetWorth();
        assertEquals(afterGo, w);
    }

    @Test
    void gotoJailSquareIsLandedOn() {
        Board board = new Board();
        Cup cup = new Cup();
        cup.addDie(new Die());
        cup.addDie(new Die());
        Player player = new Player("Player", board, cup);

        String name = "GoToJail";
        Square square = new GoToJail(name);
        player.getPiece().setLocation(square);
        assertTrue(square.landedOn(player));

    }

    @Test
    void playerIsInJail(){
        Board board = new Board();
        Cup cup = new Cup();
        cup.addDie(new Die());
        cup.addDie(new Die());
        Player player = new Player("Player", board, cup);

        String name = "GoToJail";
        Square square = new GoToJail(name);
        player.getPiece().setLocation(square);
        square.landedOn(player);
        Square test = player.getPiece().getLocation();

        assertEquals(player.getPiece().getLocation().getName(), "jail");

    }



}