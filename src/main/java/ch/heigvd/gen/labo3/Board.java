package ch.heigvd.gen.labo3;

public class Board {
    private Square map[];

    public Board() {
        map = new Square[40];

        for(Integer i = 0; i < 40; i++) {
            map[i] = new Square("square#" + i.toString());
        }
    }

    public Square getSquare() {
        return map[0];
    }
}
