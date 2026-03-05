package lab11_2;

public class ThreeDice {
    private Dice d1;
    private Dice d2;
    private Dice d3;
    private int total;

    public ThreeDice() {
        d1 = new Dice();
        d2 = new Dice();
        d3 = new Dice();
    }

    public void play() {
        rollDices();
        showDiceScore();
        addDiceScore();
        showGameResult();
    }

    private void rollDices() {
        d1.roll();
        d2.roll();
        d3.roll();
    }

    private void showDiceScore() {
        System.out.println(d1.getScore() + " " + d2.getScore() + " " + d3.getScore());
    }

    private void addDiceScore() {
        total = d1.getScore() + d2.getScore() + d3.getScore();
    }

    private void showGameResult() {
        if ((d1.getScore() == d2.getScore() && d2.getScore() == d3.getScore()) ||
            (d1.getScore() % 2 == 1 && d2.getScore() % 2 == 1 && d3.getScore() % 2 == 1) ||
            (d1.getScore() % 2 == 0 && d2.getScore() % 2 == 0 && d3.getScore() % 2 == 0)) {
            System.out.println("You win.");
        } else {
            System.out.println("You lose.");
        }
    }
}