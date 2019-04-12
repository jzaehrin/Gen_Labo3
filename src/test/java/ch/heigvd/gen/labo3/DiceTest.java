package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {
    @RepeatedTest(100)
    void shouldHaveAValueBetween1and6() {
        Dice dice = new Dice();

        dice.roll();
        assertTrue(dice.getFaceValue() >= 1 && dice.getFaceValue() <= 6, Integer.toString(dice.getFaceValue()));
    }

    @Test
    void shouldTouchAllValueOfADice() {
        Dice dice = new Dice();
        int values[] = new int[6];

        for(int i = 0; i < 100; i++) {
            dice.roll();
            values[dice.getFaceValue()-1]++;
        }

        for(int value: values) {
            assertTrue(value > 0);
        }
    }

    @Test
    void shouldHaveZeroWithoutRoll() {
        Dice dice = new Dice();

        assertEquals(dice.getFaceValue(),0);
    }
}
