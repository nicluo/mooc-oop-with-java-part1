import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 79.3: Create a program that asks the user to input numbers of type integer. When the user gives -1, the
         * program stops and prints the sum of the given numbers (excluding the -1).
         */
        
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();

        System.out.println("Type Numbers:");

        while(true) {
            int input = reader.nextInt();

            if (input == -1) {
                break;
            }

            stats.addNumber(input);
        }

        System.out.println("sum: " + stats.sum());
    }
}
