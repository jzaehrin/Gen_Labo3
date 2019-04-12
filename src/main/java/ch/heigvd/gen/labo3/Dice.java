package ch.heigvd.gen.labo3;

import java.util.Random;

public class Dice {
    private int faceValue;
    private Random random;

    public Dice() {
        random = new Random();
    }

    public void roll() {
        faceValue = random.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
