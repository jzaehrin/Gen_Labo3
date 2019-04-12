package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoSquareTest {
    @Test
    void goSquareShouldHaveAName() {
        String name = "GoSquare";

        Square square = new RegularSquare(name);

        assertEquals(square.getName(), name);
    }
}
