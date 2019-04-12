package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailTest {
    @Test
    void goSquareShouldHaveAName() {
        String name = "GoToJailSquare";

        Square square = new RegularSquare(name);

        assertEquals(square.getName(), name);
    }

}