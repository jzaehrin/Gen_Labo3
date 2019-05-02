package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularSquareTest {
    private static String name;
    private static RegularSquare regularSquare;

    @BeforeAll
    static void setup() {
        name = "RegularSquare#1";
        regularSquare = new RegularSquare(name);
    }
    @Test
    void regularSquareShouldHaveAName() {
        assertEquals(regularSquare.getName(), name);
    }

    @Test
    void regularSquareNotActionHasPerformed(){
        Board board = new Board();
        Cup cup = new Cup();
        cup.addDie(new Die());
        cup.addDie(new Die());
        Player player = new Player("Player", board, cup);

        int beforeLandedOn = player.getNetWorth();

        player.getPiece().setLocation(regularSquare);
        player.getPiece().getLocation().landedOn(player);

        assertEquals(regularSquare, player.getPiece().getLocation());
        assertEquals(beforeLandedOn, player.getNetWorth());
    }
}
