package org.example.training.rpssolid;

import org.example.training.rpssolid.enums.GameState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameStatusTest {

    @Test
    public void testNewEndGameStatus(){
        EndGameStatus endGameStatus = new EndGameStatus();
        Assertions.assertNotNull(endGameStatus);
    }

    @Test
    public void testShowGameStatus() {
        EndGameStatus endGameStatus = new EndGameStatus();
        Assertions.assertEquals(GameState.PLAYING,endGameStatus.getGameState());

    }
}
