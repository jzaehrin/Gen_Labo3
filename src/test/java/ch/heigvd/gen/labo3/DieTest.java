package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {
    @RepeatedTest(100)
    void shouldHaveAValueBetween1and6() {
        Die die = new Die();

        die.roll();
        assertTrue(die.getFaceValue() >= 1 && die.getFaceValue() <= 6);
    }

    @Test
    void shouldTouchAllValueOfADice() {
        Die die = new Die();
        int values[] = new int[6];

        for(int i = 0; i < 100; i++) {
            die.roll();
            values[die.getFaceValue()-1]++;
        }

        for(int value: values) {
            assertTrue(value > 0);
        }
    }
}
