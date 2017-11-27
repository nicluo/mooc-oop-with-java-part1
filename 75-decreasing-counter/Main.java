import java.util.*;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("75.1");

            DecreasingCounter counter = new DecreasingCounter(10);

            counter.printValue();

            counter.decrease();
            counter.printValue();

            counter.decrease();
            counter.printValue();
        }

        {
            System.out.println("75.2");

            DecreasingCounter counter = new DecreasingCounter(2);

            counter.printValue();

            counter.decrease();
            counter.printValue();

            counter.decrease();
            counter.printValue();

            counter.decrease();
            counter.printValue();
        }

        {
            System.out.println("75.3");

            DecreasingCounter counter = new DecreasingCounter(100);

            counter.printValue();

            counter.reset();
            counter.printValue();

            counter.decrease();
            counter.printValue();
        }

        {
            System.out.println("75.4");
            
            DecreasingCounter counter = new DecreasingCounter(100);

            counter.printValue();

            counter.decrease();
            counter.printValue();

            counter.decrease();
            counter.printValue();

            counter.reset();
            counter.printValue();

            counter.setInitial();
            counter.printValue();
        }
    }
}
