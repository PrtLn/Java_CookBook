import java.util.regex.PatternSyntaxException;

/**
 * Created by Pikalova Lena on 3/9/2017.
 */

class KVSplit {

    public static KVPair[] getKVPairs(String str,
                                      String pairSep,
                                      String kvSep)
        throws PatternSyntaxException, KVSplitException {

        // trim the string to remove leading and trailing spaces
        str = str.trim();

        // split the string into individual strings containing one key/value pair
        String[] kvStrs = str.split(pairSep);

        // construct an array that will hold each key and value as individual strings
        KVPair[] kvps = new KVPair[kvStrs.length];

        // extract each key and value
        String[] tmp;
        for (int i = 0; i < kvStrs.length; i++) {
            tmp = kvStrs[i].split(kvSep);
            if (tmp.length != 2) throw new KVSplitException();
            // otherwise, store the next key and value
            kvps[i] = new KVPair(tmp[0], tmp[1]);
        }
        return kvps;
    }
}
