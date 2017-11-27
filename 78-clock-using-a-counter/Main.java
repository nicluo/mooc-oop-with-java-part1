import java.util.*;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("78.2");

            BoundedCounter counter = new BoundedCounter(14);
            System.out.println("Value at start: " + counter );

            int i = 0;
            while ( i < 16){
                counter.next();
                System.out.println("value: " + counter );
                i++;
            }
        }
        {
            System.out.println("78.3");

            BoundedCounter minutes = new BoundedCounter(59);
            BoundedCounter hours = new BoundedCounter(23);

            int i = 0;
            while ( i < 121 ) {
                System.out.println( hours + ":" + minutes);

                // advance minutes
                minutes.next();

                // if minutes become zero, advance hours
                if(minutes.getValue() == 0) {
                    hours.next();
                }
                i++;
            }
        }
    }
}
