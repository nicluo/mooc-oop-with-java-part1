/**
 * In Unicafe, a client pays either with cash or with a Lyyra Card. The personnel uses a cash register to charge the
 * client. Let us start by implementig the part of CashRegister that takes care of cash payments.
 */
public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= 2.50) {
            // the price of lunch is added to register
            this.cashInRegister += 2.50;

            // the amount of the sold lunches is incremented by one
            this.economicalSold++;

            // the method returns cashGiven - lunch price
            return cashGiven - 2.50;
        }

        // if not enough money is given, all is returned and nothing else happens
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= 4.00) {
            // the price of lunch is added to the register
            this.cashInRegister += 4.00;

            // the amount of the sold lunches is incremented by one
            this.gourmetSold++;

            // the method returns cashGiven - lunch price
            return cashGiven - 4.00;
        }

        // if not enough money is given, all is returned and nothing else happens
        return cashGiven;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    /**
     * Extend the cash register with methods to charge a lunch price from a Lyyra Card.
     */

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        if (card.pay(2.50)) {
            // the amount of sold lunches is incremented by one
            this.economicalSold++;

            // the method returns true
            return true;
        }

        // if not, the method returns false
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        if (card.pay(4.00)) {
            // the amount of sold lunches is incremented by one
            this.gourmetSold++;

            // the method returns true
            return true;
        }

        // if not, the method returns false
        return false;
    }

    /**
     * Extend the cash register with a method that can be used to load cash to Lyyra Cards.
     */
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);

            this.cashInRegister += sum;
        }
    }
}