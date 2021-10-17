package regexconcept;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
        {
            Matcher matcher = pattern.matcher("abc@yahoo.com");
            {
                if (matcher.find())
                    System.out.println("valid mail id");
                else
                    System.out.println("invalid mail id");
            }
            Matcher matcher1 = pattern.matcher("abc-100@yahoo.com");
            {
                if (matcher1.find())
                    System.out.println("valid mail id");
                else
                    System.out.println("invalid mail id");
            }
            Matcher matcher2 = pattern.matcher("abc.100@yahoo.com");
            if (matcher2.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher3 = pattern.matcher("abc111@abc.com");
            if (matcher3.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher4 = pattern.matcher("abc-100@abc.net");
            if (matcher4.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher5 = pattern.matcher("abc.100@abc.com.au");
            if (matcher5.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher6 = pattern.matcher("abc@1.com");
            if (matcher6.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher7 = pattern.matcher("abc@gmail.com.com");
            if (matcher7.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher8 = pattern.matcher("abc+100@gmail.com");

            if (matcher8.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
        }
    }
}
