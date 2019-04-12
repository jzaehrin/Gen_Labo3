package ch.heigvd.gen.labo3;

public class Player {
    private Die[] die;
    private final String name;
    private int fv = 0;
    private final Piece piece;
    private Board board;

    public Player(String name, Board board, Die[] die) {
        this.die = die;
        this.name = name;
        piece = new Piece(name, board.getSquare());
        this.board = board;
    }

    public void takeTurn(){
        for (Die d : die){
            d.roll();
            fv += d.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
    }

}
