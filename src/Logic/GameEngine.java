package Logic;

import Entity.Player;

public class GameEngine {

    private Player playerOne;
    private Player playerTwo;

    private final int SERVER_TICK_MS = 500;

    public GameEngine(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() throws InterruptedException {
        System.out.println("[LOG][INFO] Creating new GameEngine");
        while(true) {
            System.out.println("[LOG][INFO] Starting new player match");

            playMatch();

            System.out.println("[LOG][INFO] Match over, sleeping for " +  (SERVER_TICK_MS / 1000.0) + " seconds");
            Thread.sleep(SERVER_TICK_MS);
        }
    }

    private void playMatch() {
        playerOne.setCurrentDiceState(DiceState.WAITING);
        playerTwo.setCurrentDiceState(DiceState.WAITING);

        playerOne.getDie().rollSixSidedDie();
        playerTwo.getDie().rollSixSidedDie();

        if (playerOne.getDie().getDie() > playerOne.getDie().getDie()) {
            System.out.println("Player one won this round!");
        } else if (playerOne.getDie().getDie() < playerOne.getDie().getDie()) {
            System.out.println("Player two won this round!");
        }
    }
}
