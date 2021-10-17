package regexconcept;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[91 ][6789]{1}[0-9]{9}$");
        Matcher matcher = pattern.matcher("91 8296702715");
        if (matcher.find())
            System.out.println("Pattern matched");
        else
            System.out.println("Pattern  not matched");
    }
}
