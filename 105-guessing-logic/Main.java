public class Main {
    public static void main(String[] args) {
        {
            System.out.println("105.1");

            GuessingGame game = new GuessingGame();
            System.out.println(game.isGreaterThan(32));
        }
        {
            System.out.println("105.2");

            GuessingGame game = new GuessingGame();

            System.out.println(game.average(3, 4));
            System.out.println(game.average(6, 12));
        }
        {
            System.out.println("105.3");

            GuessingGame game = new GuessingGame();

            game.play(1, 4);
        }
    }
}
