package ch.heigvd.gen.labo3;

public class Piece {
    private String name;
    private Square location;
<<<<<<< HEAD


=======


>>>>>>> 2d6c6fad9f101612fba439c3a621f40f235364ba
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
