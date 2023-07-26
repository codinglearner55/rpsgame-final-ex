package org.example.training.rpssolid;

import org.example.training.rpssolid.enums.Option;
import org.example.training.rpssolid.enums.PlayerType;

import java.util.Random;

public class PCPlayer implements Player{

    private String name;
    private Option option;

    private final PlayerType playerType = PlayerType.Computer;


    public PCPlayer() {
        setPlayerName("Computer Player");
    }
    @Override
    public void setPlayerName(String name) {
        this.name = name;
    }

    @Override
    public String getPlayerName() {
        return this.name;
    }

    @Override
    public Option getPlayerOption() {
        return this.option;
    }

    public void setPlayerChoice(Option option) {
        if (option == null) {
            decideOnPlayerChoice();
        } else
            this.option = option;
    }

    @Override
    public PlayerType getPlayerType() {
        return playerType;
    }

    private void decideOnPlayerChoice () {
        Random random = new Random();
        int randomChoice = random.nextInt(3);
        setPlayerChoice(Option.values()[randomChoice]);
    }
}
