import java.util.Arrays;

/**
 * Created by Pikalova Lena on 3/8/2017.
 */

public class IgnoreCaseSort {
    public static void main(String[] args) {

        String[] strings = {"alpha", "Gammma", "Zetta", "beta"};

        System.out.print("Initial order: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // sort the array, but ignore case differences using the comparator
        IgnoreCaseComparator icc = new IgnoreCaseComparator();
        Arrays.sort(strings, icc);

        System.out.print("Case-insensitive sorted order: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // sort the strings using the default order (case-sensitive)
        Arrays.sort(strings);

        System.out.print("Default, case-sensetive sorted order: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
