/**
 * 79.1: Implement class NumberStatistics with the following methods:
 * addNumber adds a new number to the statistics
 * amountOfNumbers tells us how many numbers have been added to the statistics
 */
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    /**
     * 79.2: Add the following methods to the class:
     * sum returns the sum of the added numbers (if no numbers added, the sum is 0)
     * average returns the average of the added numbers (if no numbers added, the average is 0)
     */
    public int sum() {
        return this.sum;
    }

    public double average() {
        return (double) this.sum() / this.amountOfNumbers();
    }
}
