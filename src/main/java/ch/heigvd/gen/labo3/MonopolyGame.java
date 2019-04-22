package ch.heigvd.gen.labo3;

import java.util.ArrayList;

public class MonopolyGame {
    private int nbRound;
    private int roundCnt;
    private Board board;
    private ArrayList<Player> players;
    private Cup cup;

    public MonopolyGame(int nbPlayer, int nbRound) {
        this.nbRound = nbRound;
        this.roundCnt = 0;

        this.board = new Board();

        this.cup = new Cup();
        this.cup.addDie(new Die());
        this.cup.addDie(new Die());

        players = new ArrayList<>(nbPlayer);
        for(int i = 0; i < nbPlayer; i++)
            players.add(new Player(String.format("player#%d", i), board, cup));
    }

    public void playGame() {
        for(roundCnt = 0; roundCnt < nbRound; roundCnt++) {
            System.out.println(String.format("Starting turn #%d", roundCnt));
            playRound();
        }
    }

    private void playRound() {
        for(Player player: players) {
            player.takeTurn();
        }
    }
}
