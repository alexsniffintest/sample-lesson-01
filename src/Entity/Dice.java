package Entity;

public class Dice {

    private int die;

    public void rollSixSidedDie() {
        die = (int) (Math.random() * 6);
    }

    public int getDie() {
        return die;
    }

    public void setDie(int die) {
        this.die = die;
    }
}
