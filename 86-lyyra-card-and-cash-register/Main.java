public class Main {
    public static void main(String[] args) {
        {
            System.out.println("86.1");

            LyyraCard cardOfPekka = new LyyraCard(10);

            System.out.println("money on the card " + cardOfPekka.balance());
            boolean succeeded = cardOfPekka.pay(8);
            System.out.println("money taken: " + succeeded);
            System.out.println("money on the card " + cardOfPekka.balance());

            succeeded = cardOfPekka.pay(4);
            System.out.println("money taken: " + succeeded);
            System.out.println("money on the card " + cardOfPekka.balance());
        }
        {
            System.out.println("86.2");

            CashRegister unicafeExactum = new CashRegister();

            double theChange = unicafeExactum.payEconomical(10);
            System.out.println("the change was " + theChange);

            theChange = unicafeExactum.payEconomical(5);
            System.out.println("the change was " + theChange);

            theChange = unicafeExactum.payGourmet(4);
            System.out.println("the change was " + theChange);

            System.out.println(unicafeExactum);
        }
        {
            System.out.println("86.3");

            CashRegister unicafeExactum = new CashRegister();

            double theChange = unicafeExactum.payEconomical(10);
            System.out.println("the change was " + theChange);

            LyyraCard cardOfJim = new LyyraCard(7);

            boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
            System.out.println("payment success: " + succeeded);
            succeeded = unicafeExactum.payGourmet(cardOfJim);
            System.out.println("payment success: " + succeeded);
            succeeded = unicafeExactum.payEconomical(cardOfJim);
            System.out.println("payment success: " + succeeded);

            System.out.println(unicafeExactum);
        }
        {
            System.out.println("86.4");

            CashRegister unicafeExactum = new CashRegister();
            System.out.println(unicafeExactum);

            LyyraCard cardOfJim = new LyyraCard(2);

            System.out.println("the card balance " + cardOfJim.balance() + " euros");

            boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
            System.out.println("payment success: " + succeeded);

            unicafeExactum.loadMoneyToCard(cardOfJim, 100);

            succeeded = unicafeExactum.payGourmet(cardOfJim);
            System.out.println("payment success: " + succeeded);

            System.out.println("the card balance " + cardOfJim.balance() + " euros");

            System.out.println(unicafeExactum);
        }
    }
}
