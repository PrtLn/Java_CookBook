import java.util.Comparator;

/**
 * Created by Pikalova Lena on 3/8/2017.
 */

class IgnoreCaseComparator implements Comparator<String> {
    @Override
    public int compare(String strA, String strB) {
        return strA.compareToIgnoreCase(strB);
    }
}
