package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {
    @Test
    void incomeTaxSquareShouldHaveAName() {
        String name = "IncomeTaxSquare";

        Square square = new RegularSquare(name);

        assertEquals(square.getName(), name);
    }
}