public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int lowerLimit = 0;
        int upperLimit = array.length - 1;
        while (lowerLimit != upperLimit) {
            int index = average(lowerLimit, upperLimit);
            if (array[index] == searchedValue) {
                return true;
            }
            if (array[index] < searchedValue) {
                lowerLimit = index + 1;
            } else {
                upperLimit = index;
            }
        }
        return array[lowerLimit] == searchedValue;
    }

    public static int average(int first, int second) {
        return (first + second) / 2;
    }
}
