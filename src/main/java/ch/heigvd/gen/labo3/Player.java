package ch.heigvd.gen.labo3;

public class Player {
    private Die[] die;
    private final String name;

    private int fv = 0;

    private final Piece piece;

    private Integer netWorth;

    private Board board;
    public Player(String name, Board board, Die[] die) {
        this.die = die;
        this.name = name;
        this.piece = new Piece(name, board.getSquare());
        this.board = board;
        this.netWorth = 1500;
    }

    public Piece getPiece() {
        return piece;
    }

    public Integer getNetWorth() {
        return netWorth;
    }

    public void addCash(Integer sum) {
        netWorth += sum;
    }

    public void reduceCash(Integer sum) {
        netWorth -= sum;
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
