import Entity.Dice;
import Entity.Player;
import Logic.GameEngine;

public class Main {

    public static void main(String[] args) {
        System.out.println("[LOG][INFO] Creating die");
        Dice die = new Dice();

        System.out.println("[LOG][INFO] Creating players");
        Player playerOne = new Player(die);
        Player playerTwo = new Player(die);

        GameEngine engine = new GameEngine(playerOne, playerTwo);

        try {
            engine.start();
        } catch (InterruptedException e) {
            System.out.println("[LOG][ERROR] Fatal server error!");
            e.printStackTrace();
            System.exit(1);
        }
    }

}
