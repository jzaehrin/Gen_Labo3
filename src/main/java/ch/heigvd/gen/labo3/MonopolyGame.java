package ch.heigvd.gen.labo3;

import java.util.ArrayList;

public class MonopolyGame {
    private int nbRound;
    private int roundCnt;
    private Board board;
    private ArrayList<Player> players;
    private Die[] dice;

    public MonopolyGame(int nbPlayer, int nbRound) {
        this.nbRound = nbRound;
        this.roundCnt = 0;

        this.board = new Board();

        this.dice = new Die[2];
        this.dice[0] = new Die();
        dice[1] = new Die();

        for(int i = 0; i < nbPlayer; i++)
            players.add(new Player(String.format("player#%d", i), board, dice));
    }

    public void playGame() {
        for(roundCnt = 0; roundCnt < nbRound; roundCnt++) {
            playRound();
        }
    }

    private void playRound() {
        for(Player player: players) {
            player.takeTurn();
        }
    }
}
