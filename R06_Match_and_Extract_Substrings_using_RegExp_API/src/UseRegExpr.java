import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pikalova Lena on 3/9/2017.
 */

public class UseRegExpr {
    public static void main(String[] args) {

//        Pattern pttn = Pattern.compile("\\b\\w+@XYZ\\.com\\b");
        Pattern pttn = Pattern.compile("\\b\\w+@\\w+\\.com\\b");

        Matcher mtchr = pttn.matcher("Company Contact Info\n" +
                                    "Tom 555-1111 tom@XYZ.com\n" +
                                    "Mary 555-22222 Mary@gmail.com\n" +
                                    "Don 555-3333 DoN@XYZ.com");

        while (mtchr.find()) {
            System.out.println("Match: " + mtchr.group());
        }
    }
}
