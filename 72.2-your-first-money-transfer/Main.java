import java.util.*;

public class Main {
    /**
     * Create a program that:
     * Creates an account named "Matt's account" with the balance of 1000
     * Creates an account named "My account" with the balance of 0
     * Withdraws 100.0 from Matt's account
     * Deposits 100.0 to My account
     * Prints both accounts
     */
    public static void main(String[] args) {
        Account mattsAccount = new Account("Matt's account",1000.00);
        Account myAccount = new Account("My account",0);
        
        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }
}
