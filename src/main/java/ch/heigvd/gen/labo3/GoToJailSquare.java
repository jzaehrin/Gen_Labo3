package ch.heigvd.gen.labo3;

public class GoToJailSquare extends Square{
    private JailSquare jail;

    GoToJailSquare(String name, JailSquare jail) {
        super(name);

        this.jail = jail;
    }

    @Override
    public void landedOn(Player p) {
        p.getPiece().setLocation(jail);

        jail.landedOn(p);
    }
}
