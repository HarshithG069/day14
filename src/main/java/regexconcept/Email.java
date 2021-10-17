package regexconcept;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?=.*[a-b])(?=.*[@])");
        Matcher matcher = pattern.matcher("abc.xyz@bl.co.in");
        if (matcher.find())
            System.out.println("Pattern matched");
        else
            System.out.println("Pattern  not matched");
    }
}
