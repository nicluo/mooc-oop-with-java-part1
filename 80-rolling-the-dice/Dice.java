import java.util.Random;

/**
 * In the template is class Dice that has the following functionality:
 * The constructor Dice(int numberOfSides) creates a new dice object that has the amount of sides defined by the
 * argument.
 * The method roll tells the result of a roll (which depends on the number of its sides)
 */

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        this.random = new Random();
    }

    public int roll() {
        return this.random.nextInt(numberOfSides) + 1;
    }
}
