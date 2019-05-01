package ch.heigvd.gen.labo3;

public class IncomeTaxSquare extends Square {


    IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    public boolean landedOn(Player p) {
        int AMOUNT = 200;
        if (p.getPiece().getLocation() == this){
            p.reduceCash(Math.min(p.getNetWorth() / 10, AMOUNT));
            return true;
        }

        return false;
    }
}
