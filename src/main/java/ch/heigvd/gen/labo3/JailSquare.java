package ch.heigvd.gen.labo3;

public class JailSquare extends Square{

    JailSquare(String name){
        super(name);
    }

    @Override
    public boolean landedOn(Player p) {
        return p.getPiece().getLocation() == this;
    }
}
