package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {
    private static Board board;
    private static Cup cup;
    private static JailSquare jailSquare;
    private static GoToJailSquare goToJailSquare;

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

        jailSquare = new JailSquare("JailSquare#1");
        goToJailSquare = new GoToJailSquare("GoToJailSquare#1", jailSquare);
    }

    @Test
    void playerGoToJailWhenIsOnGoToJailSquare() {
        player.getPiece().setLocation(goToJailSquare);
        player.getPiece().getLocation().landedOn(player);

        assertEquals(jailSquare, player.getPiece().getLocation());
    }
}