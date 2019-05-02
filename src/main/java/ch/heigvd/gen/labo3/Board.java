package ch.heigvd.gen.labo3;

import java.util.ArrayList;

public class Board {
    private final int size = 40;
    private ArrayList<Square> map;

    public Board() {
        map = new ArrayList<>(size);

        map.add(new GoSquare());

        for(Integer i = 1; i < size; i++) {
            map.add(new RegularSquare("square#" + i.toString()));
        }

        JailSquare jail = new JailSquare("JailSquare#1");
        map.set(5, jail);
        map.set(15, new IncomeTaxSquare("IncomeTaxSquare#1"));
        map.set(30, new GoToJailSquare("GoToFailSquare#1", jail));
    }

    public Square getSquare() {
        return map.get(0);
    }

    public Square getSquare(Square current, int step) {
        return map.get((map.indexOf(current) + step)%size);
    }

    public int indexOfSquare(Square current) {
        return map.indexOf(current);
    }
}
