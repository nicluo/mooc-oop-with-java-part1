public class LyyraCard {
    private double balance;

    /**
     * 77.1: Implement the LyyraCard constructor that gets the starting balance of the card as parameter.
     */
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    /**
     * 77.1: Implement also the toString method that returns a string of the form "The card has X euros".
     */
    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    /**
     * 77.2: Implement the following methods to LyyraCard:
     *
     * 77.3: Change methods payEconomical and payGourmet so that if there is not enough money, the balance does not
     * change.
     */

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    /**
     * 77.4: Add the LyyraCard the following method:
     *
     * 77.5: Change the method loadMoney so that the balance of the card does not change if the amount to load is negative.
     */
    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
}
