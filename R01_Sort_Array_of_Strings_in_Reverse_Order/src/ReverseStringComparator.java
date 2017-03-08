import java.util.Comparator;

/**
 * Created by Pikalova Lena on 3/8/2017.
 */

// create a Comparator that returns the outcome of a reverse string comparison
class ReverseStringComparator implements Comparator<String> {
    @Override
    public int compare(String strA, String strB) {
        return strB.compareTo(strA);
    }
}
