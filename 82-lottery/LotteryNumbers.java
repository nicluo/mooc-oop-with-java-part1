import java.util.ArrayList;
import java.util.Random;

/**
 * Your assignment is to expand the class LotteryNumbers, which draws the lottery numbers of the week.
 * The numbers of the week consist of 7 different numbers between 1 and 39. The class has the following functionality:
 *
 * The constructor LotteryNumbers creates a new LotteryNumbers object, which contains the new drawn numbers
 * The method numbers returns the drawn numbers of this draw
 * The method drawNumbers draws new numbers
 * The method containsNumber reveals if the number is among the drawn numbers
 */
public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int draw;
            do {
                draw = random.nextInt(39) + 1;
            } while (this.containsNumber(draw));

            this.numbers.add(draw);
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        return this.numbers().contains(number);
    }
}
    