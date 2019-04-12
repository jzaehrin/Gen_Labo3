package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void playerShould1500DollarAtStart() {
        Board board = new Board();
        Die[] dice = new Die[2];
        dice[0] = new Die();
        dice[1] = new Die();

        Player player = new Player("test", board, dice);

        assertEquals(1500, player.getNetWorth());
    }

    @Test
    void playerShouldHaveMoved(){
        Board board = new Board();
        Die[] dice = new Die[2];
        for (int i = 0; i < dice.length; i++){
            dice[i] = new Die();
        }

        Player p = new Player("test", board, dice);

        int oldLoc = board.indexOfSquare(p.getPiece().getLocation());

        p.takeTurn();

        int newLoc = board.indexOfSquare(p.getPiece().getLocation());

        assertTrue(oldLoc < newLoc);

    }

    @Test
    void playerShouldMoveOfAtLeast2(){
        Board board = new Board();
        Die[] dice = new Die[2];
        for (int i = 0; i < dice.length; i++){
            dice[i] = new Die();
        }

        Player p = new Player("test", board, dice);

        int oldLoc = board.indexOfSquare(p.getPiece().getLocation());

        p.takeTurn();

        int newLoc = board.indexOfSquare(p.getPiece().getLocation());

        assertTrue(oldLoc <= newLoc - 1);
    }
}