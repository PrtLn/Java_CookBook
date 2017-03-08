import java.util.Arrays;

/**
 * Created by Pikalova Lena on 3/8/2017.
 */

public class ReverseStringSort {
    public static void main(String[] args) {

        String[] strings = {"dog", "horse", "zebra", "cow", "cat"};

        System.out.print("Initial order: ");
        for(String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // sort the array in reverse order (using the reverse comparator)
        ReverseStringComparator rsc = new ReverseStringComparator();
        Arrays.sort(strings, rsc);

        System.out.print("Sorted in reverse order: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // sort the strings in natural order (by alphabetical)
        Arrays.sort(strings);

        System.out.print("Sorted in natural order: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
