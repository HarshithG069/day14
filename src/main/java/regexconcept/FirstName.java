package regexconcept;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FirstName {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher("Harshitha");
        if (matcher.find())
            System.out.println("Pattern matched");
        else
            System.out.println("Pattern  not matched");
    }
}
