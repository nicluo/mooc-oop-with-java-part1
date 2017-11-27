/**
 * Start by completing the "stupid" version of the Lyyra card. The card holds the balance and has only two methods,
 * public void loadMoney(double amount) that is already implemented and public boolean pay(double amount) that you
 * should complete
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount){
        // the method checks if the balance of the card is at least the amount given as parameter
        // if not, the method returns false meaning that the card could not be used for the payment
        if (this.balance < amount) {
            return false;
        }

        // if the balance is enough, the given amount is taken from the balance and true is returned
        this.balance -= amount;
        return true;
    }
}
