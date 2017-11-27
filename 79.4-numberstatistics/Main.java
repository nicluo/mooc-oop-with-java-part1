import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 79.4: Change your program so that it also calculates the sum of even and odd numbers in the user input
         * (again -1 excluded).
         */

        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();

        System.out.println("Type Numbers:");

        while(true) {
            int input = reader.nextInt();

            if (input == -1) {
                break;
            }

            stats.addNumber(input);

            if(input % 2 == 0) {
                statsEven.addNumber(input);
            } else {
                statsOdd.addNumber(input);
            }
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + statsEven.sum());
        System.out.println("sum of odd: " + statsOdd.sum());
    }
}
