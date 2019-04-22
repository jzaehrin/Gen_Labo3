package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupTest {
    private Cup cup;
    @BeforeEach
    void init() {
        cup = new Cup();
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3,4,5,6,7,8,9,10})
    void cupShouldUseManyDie(int nbDie) {
        for(int i = 0; i < nbDie; i++)
            cup.addDie(new Die());

        for(int i = 0; i < 100; i++) {
            cup.roll();

            assertTrue(cup.getTotal() >= nbDie && cup.getTotal() <= nbDie * 6, String.format("Failed for %d die with total of %d", nbDie, cup.getTotal()));
        }
    }
}
