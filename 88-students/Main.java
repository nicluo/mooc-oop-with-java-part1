import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("88.1");

            Student pekka = new Student("Pekka Mikkola", "013141590");
            System.out.println("name: " + pekka.getName());
            System.out.println("studentnumber: " + pekka.getStudentNumber());
            System.out.println(pekka);
        }
        {
            System.out.println("88.2, 88.3");

            ArrayList<Student> list = new ArrayList<Student>();

            Scanner reader = new Scanner(System.in);

            while (true) {
                System.out.print("name: ");
                String name = reader.nextLine();
                if (name.length() == 0) {
                    break;
                }

                System.out.print("studentnumber: ");
                String studentNumber = reader.nextLine();
                Student s = new Student(name, studentNumber);
                list.add(s);
            }

            System.out.println(""); // section break

            for (Student s : list) {
                System.out.println(s);
            }

            System.out.println(""); // section break

            /**
             * Extend the program so that after the student info has been entered and students printed, the user can
             * search the student list based on a given search term.
             */

            System.out.print("Give search term: ");
            String searchTerm = reader.nextLine();

            for (Student s : list) {
                if (s.getName().contains(searchTerm)) {
                    System.out.println(s);
                }
            }
        }
    }
}
