import java.util.*;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("79.1");

            NumberStatistics stats = new NumberStatistics();
            stats.addNumber(3);
            stats.addNumber(5);
            stats.addNumber(1);
            stats.addNumber(2);
            System.out.println("Amount: " + stats.amountOfNumbers());
        }
        {
            System.out.println("79.2");

            NumberStatistics stats = new NumberStatistics();
            stats.addNumber(3);
            stats.addNumber(5);
            stats.addNumber(1);
            stats.addNumber(2);
            System.out.println("Amount: " + stats.amountOfNumbers());
            System.out.println("sum: " + stats.sum());
            System.out.println("average: " + stats.average());
        }
    }
}
