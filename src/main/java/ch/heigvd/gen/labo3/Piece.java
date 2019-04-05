package ch.heigvd.gen.labo3;

import static java.util.Objects.requireNonNull;

public class Piece {
    private String name;

    public Piece(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
