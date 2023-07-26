import org.example.training.rpssolid.*;

import java.util.prefs.PreferenceChangeEvent;

public class App {
    public static void main(String[] args) {
        Player player1 = new HumanPlayer();
        Player player2 = new PCPlayer();
        GameLogic gameLogic2P = new GameLogic2P();
        RpsGame rpsGame = new RpsGame(gameLogic2P); // Currently only one type but attempting to use Dependency Injection pattern
        GameStatus endGameStatus = rpsGame.play(player1,player2);

        System.out.println("Game winner is: " + endGameStatus.getWinner());
        System.out.println("Game Loser is: " + endGameStatus.getLoser());
    }
}
