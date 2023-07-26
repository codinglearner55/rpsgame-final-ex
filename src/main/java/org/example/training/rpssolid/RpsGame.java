package org.example.training.rpssolid;

import org.example.training.rpssolid.enums.GameState;
import org.example.training.rpssolid.enums.Option;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RpsGame extends Game {

    private static EndGameStatus endGameStatus;

    public RpsGame () {
        endGameStatus = new EndGameStatus();
    }

    public void getPlayerName(Player player){
        user_input = new Scanner(System.in);
        System.out.println("Please enter your name");
        player.setPlayerName(user_input.next());
    }
    @Override
    public EndGameStatus play(Player player1, Player player2, GameLogic gameLogic) {
        System.out.println("The game has started");

        if (endGameStatus.getGameState() != GameState.DRAW)
            getPlayerName(player1);

        // Show the menu and get the players choice
        System.out.println("Please enter your choice:");
        int i = 0;
        for (Option option : Option.values()){
            System.out.println((i+1) + " : " + option);
            i++;
        }

        player1.setPlayerChoice(Option.values()[user_input.nextInt()-1]);

        System.out.println(player1.getPlayerName() + " has chosen " + player1.getPlayerOption());

        System.out.println(player2.getPlayerName() + " is thinking ...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Option option = null;
        player2.setPlayerChoice(option);

        System.out.println(player2.getPlayerName() + " has chosen " + player2.getPlayerOption());

        if (player1.getPlayerOption() == player2.getPlayerOption()) {
            System.out.println("Game is a draw");
            endGameStatus.setGameState(GameState.DRAW);
            // then play again
            play(player1, player2, gameLogic);
        }

        gameLogic.getWinner(player1, player2, endGameStatus);

        return endGameStatus;
    }


}
