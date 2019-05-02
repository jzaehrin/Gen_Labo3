package ch.heigvd.gen.labo3;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class MonopolyGameTest {

    @Test
    void aGameShouldTakeLessThen2second () {
        MonopolyGame monopolyGame = new MonopolyGame(8, 40);
        assertTimeoutPreemptively(Duration.ofSeconds(2), () -> { monopolyGame.playGame(); });
    }
}
