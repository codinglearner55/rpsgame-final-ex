package org.example.training.rpssolid;

import org.example.training.rpssolid.enums.Option;
import org.example.training.rpssolid.enums.PlayerType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PlayerTest {


     @BeforeAll
        public  static void globalSetup(){
        System.out.println("Running Player tests");
    }
    @Test
    public void PCPlayerNameTest (){
        PCPlayer player = new PCPlayer();
        player.setPlayerName("pcplayername");
        Assertions.assertEquals("pcplayername",player.getPlayerName());
    }
    @Test
    public void PCPlayerChoiceTest (){
        PCPlayer player = new PCPlayer();
        player.setPlayerChoice(Option.ROCK);
        Assertions.assertEquals(Option.ROCK,player.getPlayerOption());
    }

    @Test
    public void PCPlayerTypeTest (){
        Player player = new PCPlayer();
        Assertions.assertEquals(PlayerType.Computer,player.getPlayerType());
    }
    @Test
    public void HumanplayerNameTest (){
        Player player = new HumanPlayer();
        player.setPlayerName("humanplayername");
        Assertions.assertEquals("humanplayername",player.getPlayerName());
    }

    @Test
    public void HumanPlayerChoiceTest (){
        Player player = new HumanPlayer();
        player.setPlayerChoice(Option.ROCK);
        Assertions.assertEquals(Option.ROCK,player.getPlayerOption());
    }

    @Test
    public void HumanPlayerTypeTest (){
        Player player = new HumanPlayer();
        Assertions.assertEquals(PlayerType.Human,player.getPlayerType());
    }

    @AfterAll
    public  static void globalCleanUp(){
        System.out.println("Player tests Completed");
    }
}
