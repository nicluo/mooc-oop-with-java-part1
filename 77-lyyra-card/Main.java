import java.util.*;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("77.2");

            LyyraCard card = new LyyraCard(50);
            System.out.println(card);

            card.payEconomical();
            System.out.println(card);

            card.payGourmet();
            card.payEconomical();
            System.out.println(card);
        }
        {
            System.out.println("77.3");

            LyyraCard card = new LyyraCard(5);
            System.out.println(card);

            card.payGourmet();
            System.out.println(card);

            card.payGourmet();
            System.out.println(card);
        }
        {
            System.out.println("77.4");

            LyyraCard card = new LyyraCard(10);
            System.out.println(card);

            card.loadMoney(15);
            System.out.println(card);

            card.loadMoney(10);
            System.out.println(card);

            card.loadMoney(200);
            System.out.println(card);
        }
        {
            System.out.println("77.5");

            LyyraCard card = new LyyraCard(10);
            System.out.println("Pekka: " + card);

            card.loadMoney(-15);
            System.out.println("Pekka: " + card);
        }

        /**
         * Write a main method that does the following:
         *
         * Creates a LyyraCard for Pekka with initial balance of 20 euros
         * Creates a LyyraCard for Brian with initial balance of 30 euros
         * Pekka buys gourmet lunch
         * Brian buys economical lunch
         * cards are printed (both on their own row, starting with the name of the card owner)
         * Pekka loads 20 euros
         * Brian buys gourmet lunch
         * cards are printed (both on their own row, starting with the name of the card owner)
         * Pekka buys economical lunch
         * Pekka buys economical lunch
         * Brian loads 50 euros
         * cards are printed (both on their own row, starting with the name of the card owner)
         */
        {
            System.out.println("77.6");

            LyyraCard cardPekka = new LyyraCard(20);
            LyyraCard cardBrian = new LyyraCard(30);

            cardPekka.payGourmet();
            cardBrian.payEconomical();

            System.out.println("Pekka: " + cardPekka);
            System.out.println("Brian: " + cardBrian);

            cardPekka.loadMoney(20);
            cardBrian.payGourmet();

            System.out.println("Pekka: " + cardPekka);
            System.out.println("Brian: " + cardBrian);

            cardPekka.payEconomical();
            cardPekka.payEconomical();
            cardBrian.loadMoney(50);

            System.out.println("Pekka: " + cardPekka);
            System.out.println("Brian: " + cardBrian);
        }
    }
}
