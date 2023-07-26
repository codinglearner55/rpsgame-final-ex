package org.example.training.rpssolid;

import org.example.training.rpssolid.enums.Option;
import org.example.training.rpssolid.enums.PlayerType;

public interface Player {

    String getPlayerName();

    void setPlayerName(String name);

    Option getPlayerOption();

    void setPlayerChoice(Option option);

    PlayerType getPlayerType();
}
