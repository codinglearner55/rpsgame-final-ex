package org.example.training.rpssolid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    // design the game by testing for what is needed/wanted

    @Test
    public void  testCreateNewGame(){
        Game game = new RpsGame();
        Assertions.assertNotNull(game);
    }

    @Test
    public void testPlayGame(){
        Game game = new RpsGame();
        Player player1 = new PCPlayer();
        Player player2 = new HumanPlayer();
        GameStatus endGameStatus = new EndGameStatus();
        GameLogic gameLogic2P = new GameLogic2P();
        endGameStatus = game.play(player1,player2,gameLogic2P);
    }



//    @Test
//    public void testCreateNewGameResult(){
//        Game game = new RpsGame();
//    }

    // p1 wins
    // p2 wins
}
