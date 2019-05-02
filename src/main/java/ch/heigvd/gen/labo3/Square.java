package ch.heigvd.gen.labo3;

public abstract class Square {
    private String name;

    Square(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void landedOn(Player p);
}
