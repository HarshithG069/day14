package regexconcept;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*+=])");
        Matcher matcher = pattern.matcher("Harshi@1");
        if (matcher.find())
            System.out.println("Pattern matched");
        else
            System.out.println("Pattern  not matched");
    }
}
