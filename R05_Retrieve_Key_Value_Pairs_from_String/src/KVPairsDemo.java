import java.util.regex.PatternSyntaxException;

/**
 * Created by Pikalova Lena on 3/9/2017.
 */

public class KVPairsDemo {
    public static void main(String[] args) {

        String testStr =
                "Name = Tom, Age = 27,  IDNum = 1234, Wage = 37.25";

        System.out.println("Key/value string: " + testStr);

        KVPair kvpairs[];
        try {
            kvpairs = KVSplit.getKVPairs(testStr, "\\s*,\\s*", "\\s*=\\s*");
        } catch (PatternSyntaxException exc) {
            System.out.println("Invalid separator exception.");
            return;
        } catch (KVSplitException exc) {
            System.out.println("Error obtaining key and values.");
            return;
        }

        // display each key and its value
        for (KVPair kvp : kvpairs) {
            System.out.println("Key: " + kvp.key +
            "\tValue: " + kvp.value);
        }
    }
}
