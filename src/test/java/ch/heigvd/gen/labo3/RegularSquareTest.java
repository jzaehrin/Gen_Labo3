package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularSquareTest {
    @Test
    void squareShouldHaveAName() {
        String name = "hasName";

        Square square = new RegularSquare(name);

        assertEquals(square.getName(), name);
    }
}
