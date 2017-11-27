/**
 * Make a class Counter that holds a number that can be decreased and increased. The counter also has an optional check
 * that prevents the counter from going below 0. The class has to have the following constructors:
 *
 * public Counter(int startingValue, boolean check) creates a new counter with the given value. The check is on if the
 * parameter given to check was true.
 * public Counter(int startingValue) creates a new counter with the given value. The check on the new counter should be
 * off.
 * public Counter(boolean check) creates a new counter with the starting value 0. The check is on if the parameter given
 * to check was true.
 * public Counter() creates a new counter with the starting value of 0 and with checking off.
 *
 * and the following methods:
 *
 * public int value() returns the current value of the counter
 * public void increase() increases the value of the counter by one
 * public void decrease() decreases the value of the counter by one, but not below 0 if the check is on
 */
public class Counter {
    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }

    /**
     * Create also a one parametered versions of the methods increase and decrease:
     *
     * public void increase(int increaseAmount) increases the value by the amount of the parameter. If the value of the
     * parameter is negative, the value will not change.
     *
     * public void decrease(int decreaseAmount) decreases the value of the counter by the amount given by the parameter,
     * but not below 0 if the check is on. If the value of the parameter is negative, the value of the counter will not change.
     */

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            this.value -= decreaseAmount;

            if (this.check && this.value < 0) {
                this.value = 0;
            }
        }
    }
}
