package ch.heigvd.gen.labo3;

import com.sun.tracing.dtrace.ProviderAttributes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private static Board board;
    private static Die[] dice;
    private Player player;

    @BeforeEach
    void init() {
        player = new Player("test", board, dice);
    }

    @BeforeAll
    static void each() {
        board = new Board();
        dice = new Die[2];
        dice[0] = new Die();
        dice[1] = new Die();
    }

    @Test
    void playerShouldHave1500DollarAtStart() {
        assertEquals(1500, player.getNetWorth());
    }

    @Test
    void playerCashShouldModifyByAddCash() {
        player.addCash(500);

        assertEquals(2000, player.getNetWorth());
    }

    @Test
    void playerCashShouldModifyByReduceCash() {
        player.reduceCash(500);

        assertEquals(1000, player.getNetWorth());
    }

    @Test
    void playerCashShouldModifyByReduceCash() {
        player.reduceCash(500);

        assertEquals(1000, player.getNetWorth());
    }

    @Test
    void playerShouldHaveMoved(){
        int oldLoc = board.indexOfSquare(player.getPiece().getLocation());

        player.takeTurn();

        int newLoc = board.indexOfSquare(player.getPiece().getLocation());

        assertTrue(oldLoc < newLoc);

    }

    @Test
    void playerShouldMoveOfAtLeast2(){
        int oldLoc = board.indexOfSquare(player.getPiece().getLocation());

        player.takeTurn();

        int newLoc = board.indexOfSquare(player.getPiece().getLocation());

        assertTrue(oldLoc <= newLoc - 1);
    }
}