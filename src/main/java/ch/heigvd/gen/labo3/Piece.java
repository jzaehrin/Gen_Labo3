package ch.heigvd.gen.labo3;

public class Piece {
    private String name;
    private Square location;


    public Piece(String name, Square location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
