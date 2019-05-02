package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {
    private static Board board;
    private static Cup cup;
    private static IncomeTaxSquare incomeTaxSquare;

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

        incomeTaxSquare = new IncomeTaxSquare("IncomeTaxSquare#1");
    }

    @Test
    void cashIsReducedBy200(){
        player.reduceCash(player.getNetWorth());
        player.addCash(2000);

        int beforeIncomeTax = player.getNetWorth();

        player.getPiece().setLocation(incomeTaxSquare);
        player.getPiece().getLocation().landedOn(player);

        assertEquals(beforeIncomeTax, player.getNetWorth() + 200);
    }

    @Test
    void cashIsReducedBy150(){
        player.reduceCash(player.getNetWorth());
        player.addCash(1500);

        int beforeIncomeTax = player.getNetWorth();

        player.getPiece().setLocation(incomeTaxSquare);
        player.getPiece().getLocation().landedOn(player);

        assertEquals(beforeIncomeTax, player.getNetWorth() + 150);
    }

}