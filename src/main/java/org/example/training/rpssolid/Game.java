package org.example.training.rpssolid;

import java.util.Scanner;

public abstract class Game {
    protected static Scanner user_input;
    public abstract GameStatus play(Player player1, Player player2);

}
