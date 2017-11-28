import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("98.1");

            int[] original = {1, 2, 3, 4};
            int[] copied = copy(original);

            // change the copied
            copied[0] = 99;

            // print both
            System.out.println("original: " + Arrays.toString(original));
            System.out.println("copied: " + Arrays.toString(copied));
        }
        {
            System.out.println("98.2");

            int[] original = {1, 2, 3, 4};
            int[] reverse = reverseCopy(original);

            // print both
            System.out.println("original: " + Arrays.toString(original));
            System.out.println("reversed: " + Arrays.toString(reverse));
        }
    }

    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        return copy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int reverseIndex = array.length - 1 - i;
            copy[i] = array[reverseIndex];
        }

        return copy;
    }
}