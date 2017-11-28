public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sBuilder.append(", ");
            }
            sBuilder.append(array[i]);
        }
        System.out.println(sBuilder.toString());
    }
}