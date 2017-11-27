/**
 * The constructor of DecreasingCounter receives as parameter the initial value of the counter. In the example, the
 * constructor parameter is 10, which is then set to the object variable this.value. The value of the counter can be
 * printed with the method printValue(). The method decrease() should decrease the value of the counter by one.
 */
public class DecreasingCounter {
    private int initialValue;
    private int value;

    public DecreasingCounter(int valueAtStart) {
        this.value = this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    /**
     * 75.1: Implement the method decrease() so that when called, the object variable this.value is decreased by one.
     * <p>
     * 75.2: Change your implementation of the method decrease() so that the value of the counter will not drop below
     * zero. If the method is called when the value is zero, nothing should happen.
     */
    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    /**
     * 75.3: Implement the method public void reset() that sets the value of the counter to zero.
     */

    public void reset() {
        this.value = 0;
    }

    /**
     * 75.4: Implement the method public void setInitial(), which returns the counter to its initial value.
     */
    public void setInitial() {
        this.value = this.initialValue;
    }
}