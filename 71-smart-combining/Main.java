import java.util.*;

public class Main {
    /**
     * Create the method smartCombine that works like the previous combine method except that numbers can be on the list
     * only once. This means that the method adds a new number to the list only if the list does not already contain
     * that number. You might find the method contains from the ArrayList class useful.
     */
    public static void smartCombine(ArrayList<Integer> a, ArrayList<Integer> b) {
        for (Integer x : b) {
            if(!a.contains(x)) {
                a.add(x);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);
        list1.add(5);

        list2.add(5);
        list2.add(10);
        list2.add(7);

        smartCombine(list1, list2);

        System.out.println(list1); // prints [4, 3, 5, 10, 7]

        System.out.println(list2); // prints [5, 10, 7]
    }
}
