import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    /**
     * Add to the class NightSky the method printLine, that prints one line of starts. The line length is determined by
     * the value of the instance variable width and the instance variable density determines the star probability. For
     * each printed character you should use a Random object to decide if it prints out as a white space or a star. The
     * method nextDouble will probably be of use now.
     */
    public void printLine() {
        Random random = new Random();
        for (int i = 0; i < this.width; i++) {
            if (random.nextDouble() < this.density) {
                this.starsInLastPrint++;
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    /**
     * Add the class NightSky the method print, that prints the night sky of the given size. Use the method printLine to
     * print each separate line of the night sky. An example in the following:
     */
    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }

    /**
     * Add the class NightSky an instance variable starsInLastPrint (int) and the method starsInLastPrint(), that
     * returns the number of stars printed in the previous night sky. Example in the below:
     */
    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
