import java.util.*;

public class Main {
    /**
     * Create a program that creates an account with the balance of 100.0, deposits 20.0 and prints the account. Note!
     * do all the steps described in the exercise exactly in the described order!
     */
    public static void main(String[] args) {
        Account myAccount = new Account("My account",100.00);
        myAccount.deposit(20.0);
        
        System.out.println(myAccount);
    }
}
