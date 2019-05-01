package ch.heigvd.gen.labo3;

public class GoToJail extends Square{
    GoToJail(String name) {
        super(name);
    }

    @Override
    public boolean landedOn(Player p) {
        JailSquare jail = new JailSquare("jail");
        if (p.getPiece().getLocation() == this){
            p.getPiece().setLocation(jail);
            return true;
        }

        return false;
    }
}
