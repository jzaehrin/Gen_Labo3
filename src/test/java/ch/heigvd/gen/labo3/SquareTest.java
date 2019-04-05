package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SquareTest {
    @Test
    void squareShouldHaveAName() {
        String name = "hasName";

        Square square = new Square(name);

        assertTrue(square.getName().equals(name));
    }
}
