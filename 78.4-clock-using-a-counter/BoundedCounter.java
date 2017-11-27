/**
 * 78.1: Implement class BoundedCounter with the following functionality:
 * <p>
 * A counter has an object variable that remembers the value of the counter. The value is within the range 0..upperBound
 * In the beginning the value is 0.
 * The upper bound of the value is defined by the constructor parameter.
 * The method next increments the value of the counter. If the value would be more that the upper limit, it wraps around
 * and becomes zero.
 * The method toString returns a string representation of the counter value.
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    /**
     * 78.2: Improve toString so that if the value of the counter is less than 10, it prefixes the value with 0. If the
     * value of the counter is e.g. 3, toString should produce "03". If the value is at least 10, e.g. 12, the returned
     * string would be "12".
     */
    public String toString() {
        return String.format("%02d", this.value);
    }

    /**
     * 78.3: Implement the method getValue for the counters in the class:
     */
    public int getValue() {
        return this.value;
    }

    /**
     * 78.4: Implement the method setValue for the counters in the class:
     */
    public void setValue(int value) {
        this.value = value;
    }
}