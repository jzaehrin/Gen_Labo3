package ch.heigvd.gen.labo3;

import java.util.Random;

public class Die {
    private int faceValue;
    private Random random;

    Die() {
        random = new Random();
    }

    void roll() {
        faceValue = random.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
