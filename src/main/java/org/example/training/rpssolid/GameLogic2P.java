package org.example.training.rpssolid;

import org.example.training.rpssolid.enums.GameState;

public class GameLogic2P extends GameLogic{

    @Override
    public void getWinner(Player player1, Player player2, GameStatus gameStatus){

        char[][] winLossMap = new char[3][3];
        //winLossMap[0][0] = 'D';
        winLossMap[0][1] = 'L';
        winLossMap[0][2] = 'W';
        winLossMap[1][0] = 'W';
        //winLossMap[1][1] = 'D';
        winLossMap[1][2] = 'L';
        winLossMap[2][0] = 'L' ;
        winLossMap[2][1] = 'W' ;
        // winLossMap[2][2] = 'D' ;


        char winOrLoss = winLossMap[player1.getPlayerOption().ordinal()][player2.getPlayerOption().ordinal()];
        if (gameStatus.getGameState() != GameState.CONCLUDED) {
            switch (winOrLoss) {
                case 'W' -> {
                    System.out.println(player1.getPlayerName() + ", Congrats You win!");
                    gameStatus.setWinner(player1.getPlayerName());
                    gameStatus.setLoser(player2.getPlayerName());
                    gameStatus.setGameState(GameState.CONCLUDED);
                }
                case 'L' -> {
                    gameStatus.setWinner(player2.getPlayerName());
                    gameStatus.setLoser(player1.getPlayerName());
                    gameStatus.setGameState(GameState.CONCLUDED);
                }
            }
        }
    }
}
