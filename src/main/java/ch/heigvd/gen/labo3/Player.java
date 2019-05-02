package ch.heigvd.gen.labo3;

public class Player {
    private Cup cup;
    private final String name;

    private int fv = 0;

    private final Piece piece;

    private Integer netWorth;

    private Board board;
    public Player(String name, Board board, Cup cup) {
        this.cup = cup;
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
        cup.roll();

        piece.setLocation(board.getSquare(piece.getLocation(), cup.getTotal()));

        piece.getLocation().landedOn(this);
    }
}
