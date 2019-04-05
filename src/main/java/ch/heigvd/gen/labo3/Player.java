package ch.heigvd.gen.labo3;

public class Player {
    private String name;
    private Square oldPos, newPos;
    private Piece piece;
    private Die die1, die2;

    public Player(String name, Square oldPos, Piece piece, Die die1, Die die2) {
        this.name = name;
        this.oldPos = oldPos;
        this.piece = piece;
        this.die1 = die1;
        this.die2 = die2;
    }

    void takeTurn(){
        die1.roll();
        die2.roll();
        int totalFV = die1.getFaceValue() + die2.getFaceValue();
        oldPos = piece.get
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Square getOldPos() {
        return oldPos;
    }

    public void setOldPos(Square oldPos) {
        this.oldPos = oldPos;
    }

    public Square getNewPos() {
        return newPos;
    }

    public void setNewPos(Square newPos) {
        this.newPos = newPos;
    }

    public Die getDie1() {
        return die1;
    }

    public Die getDie2() {
        return die2;
    }
}
