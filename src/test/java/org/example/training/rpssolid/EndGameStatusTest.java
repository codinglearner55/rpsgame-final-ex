package org.example.training.rpssolid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EndGameStatusTest {

    @Test
    public void EndGameStatusWinnerTest(){
        GameStatus endGameStatus = new EndGameStatus();
        endGameStatus.setWinner("player1");
        Assertions.assertEquals("player1",endGameStatus.getWinner());

    }
    @Test
    public void EndGameStatusLoserTest(){
        GameStatus endGameStatus = new EndGameStatus();
        endGameStatus.setLoser("player2");
        Assertions.assertEquals("player2",endGameStatus.getLoser());
    }
}
