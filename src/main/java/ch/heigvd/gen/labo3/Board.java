package ch.heigvd.gen.labo3;

import java.util.ArrayList;

public class Board {
    private final int size = 40;
    private ArrayList<Square> map;

    public Board() {
        map = new ArrayList<>(size);

        for(Integer i = 0; i < size; i++) {
            map.add(new Square("square#" + i.toString()));
        }
    }

    public Square getSquare() {
        return map.get(0);
    }

    public Square getSquare(Square current, int step) {
        return map.get((map.indexOf(current) + step)%size);
    }
}
