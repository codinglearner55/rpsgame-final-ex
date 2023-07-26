package org.example.training.rpssolid;

import org.example.training.rpssolid.enums.Option;
import org.example.training.rpssolid.enums.PlayerType;

public class HumanPlayer implements Player {

    private String name;
    private Option option;

    private final PlayerType playerType = PlayerType.Human;

    public HumanPlayer () {

    }

    @Override
    public void setPlayerName (String name){
        this.name = name;
    }
    @Override
    public String getPlayerName (){
        return this.name;
    }
    @Override
    public void setPlayerChoice(Option option){
        this.option = option;
    }
    @Override
    public Option getPlayerOption() {
        return this.option;
    }

    @Override
    public PlayerType getPlayerType(){
        return playerType;
    }
}
