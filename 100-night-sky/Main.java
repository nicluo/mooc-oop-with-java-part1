public class Main {
    public static void main(String[] args) {
        {
            System.out.println("100.1");

            NightSky NightSky = new NightSky(0.1, 40, 10);
            NightSky.printLine();
        }
        {
            System.out.println("100.2");

            NightSky NightSky = new NightSky(8, 4);
            NightSky.print();
        }
        {
            System.out.println("100.3");

            NightSky NightSky = new NightSky(8, 4);
            NightSky.print();
            System.out.println("Number of stars: " + NightSky.starsInLastPrint());
            System.out.println("");

            NightSky.print();
            System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        }
    }
}