/**
 * Created by Pikalova Lena on 3/8/2017.
 */

public class IgnoreCaseDemo {
    public static void main(String[] args) {

        String str = "This is a TEST.";

        System.out.println("Ignore case when searching. \n" +
                "Looking for 'test' in: " + str);

        // to find any version of 'test'
        if (str.matches("(?i).*test.*")) {
            System.out.println("'test' is in the string.");
        }
        System.out.println();

        str = "alpha beta, Alpha beta, aLPHa beta, ALPHA beta";

        // to ignore case when replacing one substring with another
        System.out.println("Ignore case when replacing.\n" +
                "Replace any version of 'alpha' " +
                "with 'zeta' in:\n" + "   " + str);

        String result = str.replaceAll("(?i)alpha", "zeta");

        System.out.println("After replacement: \n" +
                "   " + result);
    }
}
