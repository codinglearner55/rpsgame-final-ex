package org.example.training.rpssolid;

import org.example.training.rpssolid.enums.GameState;

public interface GameStatus {
    public void outputGameState();

    GameState getGameState();

    public void setGameState(GameState gameState);

    void setWinner(String player);

    String getWinner();

    void setLoser(String player2);

    String getLoser();
}
