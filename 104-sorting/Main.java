import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("104.1");

            int[] values = {6, 5, 8, 7, 11};
            System.out.println("smallest: " + smallest(values));
        }
        {
            System.out.println("104.2");

            int[] values = {6, 5, 8, 7, 11};
            System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        }
        {
            System.out.println("104.3");

            int[] values = {-1, 6, 9, 8, 12};
            System.out.println(indexOfTheSmallestStartingFrom(values, 1));
            System.out.println(indexOfTheSmallestStartingFrom(values, 2));
            System.out.println(indexOfTheSmallestStartingFrom(values, 4));
        }
        {
            System.out.println("104.4");

            int[] values = {3, 2, 5, 4, 8};

            System.out.println(Arrays.toString(values));

            swap(values, 1, 0);
            System.out.println(Arrays.toString(values));

            swap(values, 0, 3);
            System.out.println(Arrays.toString(values));
        }
        {
            System.out.println("104.5");

            int[] values = {8, 3, 7, 9, 1, 2, 4};
            sort(values);
        }
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int e : array) {
            if (e < smallest) {
                smallest = e;
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestIndex = 0;
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallestIndex = i;
                smallest = array[i];
            }
        }

        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestIndex = index;
        int smallest = array[index];

        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallestIndex = i;
                smallest = array[i];
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
