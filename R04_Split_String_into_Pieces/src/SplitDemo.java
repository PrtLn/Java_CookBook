/**
 * Created by Pikalova Lena on 3/8/2017.
 */

public class SplitDemo {

    static void showSplit(String[] strings) {
        for (String str : strings) {
            System.out.print(str + "|");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        String result[];

        // split at spaces
        String testStr = "This is   a test.";
        System.out.println("Original string: " + testStr);
        result = testStr.split("\\s+");
        System.out.print("Split at spaces: ");
        showSplit(result);

        // split on word boundaries
        testStr = "One, Two, and Three.";
        System.out.println("Original string: " + testStr);
        result = testStr.split("\\W+");
        System.out.print("Split at word boundaries: ");
        showSplit(result);

        // split same string on commas and zero or more spaces
        System.out.println("Original string: " + testStr);
        result = testStr.split(",\\s*");
        System.out.print("Split at commas: ");
        showSplit(result);

        // split on word boundaries, but allow embedded periods and @
        testStr = "Lena Pirit@gmail.com.";
        System.out.println("Original string: " + testStr);
        result = testStr.split("[\\W && [^,@]]+");
        System.out.print("Allow . and @ to be part of a word: ");
        showSplit(result);

        // split on various punctuation and zero or more trailing spaces
        testStr = "This, is. a!:; test?";
        System.out.println("Original string: " + testStr);
        result = testStr.split("[.,!?;:]+\\s*");
        System.out.print("Split on various punctuation: ");
        showSplit(result);
    }
}
