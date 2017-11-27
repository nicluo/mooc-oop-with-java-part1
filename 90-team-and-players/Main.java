import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("90.1, 90.2");

            Team barcelona = new Team("FC Barcelona");
            System.out.println("Team: " + barcelona.getName());

            Player brian = new Player("Brian");
            System.out.println("Player: " + brian);

            Player pekka = new Player("Pekka", 39);
            System.out.println("Player: " + pekka);
        }
        {
            System.out.println("90.3");

            Team barcelona = new Team("FC Barcelona");

            Player brian = new Player("Brian");
            Player pekka = new Player("Pekka", 39);

            barcelona.addPlayer(brian);
            barcelona.addPlayer(pekka);
            barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

            barcelona.printPlayers();
        }
        {
            System.out.println("90.4");

            Team barcelona = new Team("FC Barcelona");
            barcelona.setMaxSize(1);

            Player brian = new Player("Brian");
            Player pekka = new Player("Pekka", 39);
            barcelona.addPlayer(brian);
            barcelona.addPlayer(pekka);
            barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

            System.out.println("Number of players: " + barcelona.size());
        }
        {
            System.out.println("90.5");


            Team barcelona = new Team("FC Barcelona");

            Player brian = new Player("Brian");
            Player pekka = new Player("Pekka", 39);
            barcelona.addPlayer(brian);
            barcelona.addPlayer(pekka);
            barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

            System.out.println("Total goals: " + barcelona.goals());
        }
    }
}
