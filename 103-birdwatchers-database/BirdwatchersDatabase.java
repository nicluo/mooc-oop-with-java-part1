import java.util.ArrayList;

public class BirdwatchersDatabase {
    ArrayList<Bird> birds;

    public BirdwatchersDatabase() {
        this.birds = new ArrayList<Bird>();
    }

    public void add(Bird bird) {
        birds.add(bird);
    }

    public boolean hasBird(String name) {
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public void observation(String name) {
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                b.observe();
                return;
            }
        }
    }

    public void printAllStatistics() {
        for (Bird b : birds) {
            System.out.println(b);
        }
    }

    public void printStatistics(String name) {
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                System.out.println(b);
                return;
            }
        }
    }
}
