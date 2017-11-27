/**
 * Implement the class Multiplier that has:
 *
 * a constructor public Multiplier(int number).
 * a method public int multiply(int otherNumber) that returns otherNumber multiplied by number (i.e., the constructor
 * parameter).
 *
 */
public class Multiplier {
    private int number;

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int otherNumber) {
        return otherNumber * this.number;
    }
}
