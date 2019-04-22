package ch.heigvd.gen.labo3;

import java.util.ArrayList;

public class Cup {
    private ArrayList<Die> dice;

    public Cup() {
        dice = new ArrayList<>();
    }

    public void addDie(Die die) {
        dice.add(die);
    }

    public void roll() {
        for(Die die : dice)
            die.roll();
    }

    public int getTotal() {
        int total = 0;

        for(Die die : dice)
            total += die.getFaceValue();

        return total;
    }
}
