import java.util.ArrayList;

public class GradeDistribution {
    int[] grades;
    int acceptedScores;
    int numberOfScores;

    public GradeDistribution() {
        grades = new int[]{0, 0, 0, 0, 0, 0};
        acceptedScores = 0;
        numberOfScores = 0;
    }

    public void addGrade(int points) {
        int grade = GradeUtils.grade(points);
        grades[grade]++;

        numberOfScores++;

        if (grade > 0) {
            acceptedScores++;
        }
    }

    public void printDistribution() {
        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ": ");
            for (int i = 0; i < grades[grade]; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public double acceptance() {
        return (double) acceptedScores / numberOfScores * 100;
    }

    public void printAcceptance() {
        System.out.println("Acceptance percentage: " + acceptance());
    }
}
