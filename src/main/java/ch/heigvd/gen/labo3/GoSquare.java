package ch.heigvd.gen.labo3;

public class GoSquare extends Square {
    private int income = 200;

    GoSquare() {
        super("GoSquare");
    }

    @Override
    public void landedOn(Player p) {
        p.addCash(income);
    }
}
