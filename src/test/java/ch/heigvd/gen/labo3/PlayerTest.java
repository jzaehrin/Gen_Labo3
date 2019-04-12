package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void pieceShouldHaveMoved(){
        Board board = new Board();
        Dice[] die = new Dice[2];
        for (int i = 0; i < die.length; i++){
            die[i] = new Dice();
        }

        Player p = new Player("test", board, die);

        int oldLoc = board.indexOfSquare(p.getPiece().getLocation());

        p.takeTurn();

        int newLoc = board.indexOfSquare(p.getPiece().getLocation());

        assertTrue(oldLoc < newLoc);

    }

    @Test
    void pieceShouldMoveOfAtLeast2(){
        Board board = new Board();
        Dice[] die = new Dice[2];
        for (int i = 0; i < die.length; i++){
            die[i] = new Dice();
        }

        Player p = new Player("test", board, die);

        int oldLoc = board.indexOfSquare(p.getPiece().getLocation());

        p.takeTurn();

        int newLoc = board.indexOfSquare(p.getPiece().getLocation());

        assertTrue(oldLoc <= newLoc - 1);
    }
}