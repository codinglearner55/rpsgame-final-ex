import org.example.training.rpssolid.*;

import java.util.prefs.PreferenceChangeEvent;

public class App {
    public static void main(String[] args) {
        Player player1 = new HumanPlayer();
        Player player2 = new PCPlayer();
        RpsGame rpsGame = new RpsGame();
        GameStatus endGameStatus = new EndGameStatus();
        GameLogic gameLogic2P = new GameLogic2P();
        endGameStatus = rpsGame.play(player1,player2,gameLogic2P);

        System.out.println("Game winner is: " + endGameStatus.getWinner());
        System.out.println("Game Loser is: " + endGameStatus.getLoser());
    }
}
