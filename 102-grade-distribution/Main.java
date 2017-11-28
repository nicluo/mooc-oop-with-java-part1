import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        GradeDistribution gradeDistribution = new GradeDistribution();

        System.out.println("Type exam scores, -1 completes:");

        while (true) {
            int input = reader.nextInt();

            if (input == -1) {
                break;
            }

            if(input < 0 || input > 60) {
                continue;
            }

            gradeDistribution.addGrade(input);
        }

        gradeDistribution.printDistribution();
        gradeDistribution.printAcceptance();
    }
}