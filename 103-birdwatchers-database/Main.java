import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdwatchersDatabase birdwatchersDatabase = new BirdwatchersDatabase();

        boolean quit = false;

        while (!quit) {
            System.out.print("? ");

            String command = reader.nextLine();

            switch (command) {
                case "Add":
                    Commands.runAdd(reader, birdwatchersDatabase);
                    break;
                case "Observation":
                    Commands.runObservation(reader, birdwatchersDatabase);
                    break;
                case "Statistics":
                    birdwatchersDatabase.printAllStatistics();
                    break;
                case "Show":
                    Commands.runShow(reader, birdwatchersDatabase);
                    break;
                case "Quit":
                    quit = true;
                    break;
                default:
            }
        }
    }
}