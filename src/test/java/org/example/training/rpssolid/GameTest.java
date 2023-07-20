package org.example.training.rpssolid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void  testCreateNewGame(){
        Game game = new RpsGame();
        Assertions.assertNotNull(game);
    }

    @Test
    public void testPlayGame(){
        Game game = new RpsGame();
        game.play();

    }

    @Test
    public void testGameResult(){
        Game game = new RpsGame();
        game.play();
        Result  result = game.getResult();
    }

    @Test
    public void testCreateNewGameResult(){
        Game game = new RpsGame();
    }

    // p1 wins
    // p2 wins
}
