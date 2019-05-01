package ch.heigvd.gen.labo3;

public class GoSquare extends Square{

    GoSquare(String name) {
        super(name);
    }

    @Override
    public boolean landedOn(Player p) {
        int AMOUNT = 200;
        if (p.getPiece().getLocation() == this){
            p.addCash(AMOUNT);
            return true;
        }
        return false;
    }
}
