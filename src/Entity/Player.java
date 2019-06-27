package Entity;

import Logic.DiceState;

public class Player {

    private Dice die;
    private DiceState currentDiceState = DiceState.WAITING;

    public Player(Dice die) {
        this.die = die;
    }

    public DiceState getCurrentDiceState() {
        return currentDiceState;
    }

    public void setCurrentDiceState(DiceState currentDiceState) {
        this.currentDiceState = currentDiceState;
    }

    public Dice getDie() {
        return die;
    }

    public void setDie(Dice die) {
        this.die = die;
    }

}
