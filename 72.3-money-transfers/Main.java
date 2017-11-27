import java.util.*;

public class Main {
    /**
     * Create the method public static void transfer(Account from, Account to, double howMuch) in the given program body.
     * The method transfers money from one account to another. You do not need to check that the from account has enough
     * balance.
     */
    public static void transfer(Account from, Account to, double amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }

    public static void main(String[] args) {
        Account aAccount = new Account("A",100.00);
        Account bAccount = new Account("B",0);
        Account cAccount = new Account("C",0);

        transfer(aAccount, bAccount, 50.00);
        transfer(bAccount, cAccount, 25.00);

        System.out.println(aAccount);
        System.out.println(bAccount);
        System.out.println(cAccount);
    }
}
