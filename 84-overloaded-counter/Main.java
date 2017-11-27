public class Main {
    public static void main(String[] args) {
        {
            Counter c = new Counter(0, true);
            System.out.println("Counter: " + c.value());
            c.increase();
            System.out.println("Counter: " + c.value());
            c.decrease();
            c.decrease();
            System.out.println("Counter: " + c.value());
        }
        {
            Counter c = new Counter(100, false);
            System.out.println("Counter: " + c.value());
            c.increase(10);
            System.out.println("Counter: " + c.value());
            c.decrease(20);
            System.out.println("Counter: " + c.value());
            c.decrease(100);
            System.out.println("Counter: " + c.value());
        }
    }
}