package org.example.training.rpssolid;

import org.example.training.rpssolid.enums.GameState;

public class EndGameStatus implements GameStatus {

    private GameState gameState;
    private String winner;
    private String loser;


    public EndGameStatus(){
        this.gameState = GameState.PLAYING;
        setWinner("Undecided");
        setLoser("Undecided");
    }
    public void outputGameState() {
        System.out.println("Current Game state: " + this.gameState);
    }

    @Override
    public GameState getGameState() {
        return this.gameState;
    }

    @Override
    public void setGameState (GameState gameState) {
        this.gameState = gameState;
    }

    @Override
    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    public String getWinner() {
        return this.winner;
    }

    @Override
    public void setLoser(String loser) {
        this.loser = loser;
    }

    @Override
    public String getLoser() {
        return this.loser;
    }
}
