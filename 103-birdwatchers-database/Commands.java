import java.util.Scanner;

public class Commands {
    public static void runAdd(Scanner reader, BirdwatchersDatabase birdwatchersDatabase) {
        System.out.print("Name: ");
        String birdAddName = reader.nextLine();
        System.out.print("Latin Name: ");
        String birdAddLatinName = reader.nextLine();
        Bird birdAdd = new Bird(birdAddName, birdAddLatinName);
        birdwatchersDatabase.add(birdAdd);
    }

    public static void runObservation(Scanner reader, BirdwatchersDatabase birdwatchersDatabase) {
        System.out.print("What was observed:? ");
        String birdObservation = reader.nextLine();
        if (birdwatchersDatabase.hasBird(birdObservation)) {
            birdwatchersDatabase.observation(birdObservation);
        } else {
            System.out.println("Is not a bird!");
        }
    }

    public static void runShow(Scanner reader, BirdwatchersDatabase birdwatchersDatabase) {
        System.out.print("What? ");
        String birdStatistics = reader.nextLine();
        birdwatchersDatabase.printStatistics(birdStatistics);
    }
}
