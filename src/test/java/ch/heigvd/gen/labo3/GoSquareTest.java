package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoSquareTest {
    private static Board board;
    private static Cup cup;
    private static GoSquare goSquare;

    private Player player;

    @BeforeEach
    void init() {
        player = new Player("test", board, cup);
    }

    @BeforeAll
    static void setup() {
        board = new Board();
        cup = new Cup();
        cup.addDie(new Die());
        cup.addDie(new Die());

        goSquare = new GoSquare();
    }

    @Test
    void netWorthHasChanged() {
        int beforeGo = player.getNetWorth();

        player.getPiece().setLocation(goSquare);
        player.getPiece().getLocation().landedOn(player);

        int afterGo = player.getNetWorth();
        assertTrue(beforeGo + 200 == afterGo);
    }
}
