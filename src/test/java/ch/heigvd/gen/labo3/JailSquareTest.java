package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JailSquareTest {
    @Test
    void playerVisitJailWithoutActionOnHis(){
        Board board = new Board();
        Cup cup = new Cup();
        cup.addDie(new Die());
        cup.addDie(new Die());
        Player player = new Player("Player", board, cup);

        JailSquare jailSquare = new JailSquare("JailSquare#1");

        int beforeJail = player.getNetWorth();

        player.getPiece().setLocation(jailSquare);
        player.getPiece().getLocation().landedOn(player);

        assertEquals(jailSquare, player.getPiece().getLocation());
        assertEquals(beforeJail, player.getNetWorth());
    }
}