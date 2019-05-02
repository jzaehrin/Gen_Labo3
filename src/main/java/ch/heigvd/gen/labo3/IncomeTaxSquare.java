package ch.heigvd.gen.labo3;

public class IncomeTaxSquare extends Square {
    private int taxe = 200;

    IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        p.reduceCash(Math.min(p.getNetWorth() / 10, taxe));
    }
}
