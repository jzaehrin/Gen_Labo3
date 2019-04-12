package ch.heigvd.gen.labo3;

public class Player {
    private Dice[] die;
    private final String name;

    private int fv = 0;

    private final Piece piece;

    private Board board;
    public Player(String name, Board board, Dice[] die) {
        this.die = die;
        this.name = name;
        piece = new Piece(name, board.getSquare());
        this.board = board;
    }

    public void takeTurn(){
        for (Dice d : die){
            d.roll();
            fv += d.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
    }

    public Piece getPiece() {
        return piece;
    }


}
