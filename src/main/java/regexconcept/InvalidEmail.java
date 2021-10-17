package regexconcept;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvalidEmail {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$");
        {
            Matcher matcher = pattern.matcher("abc");
            if (matcher.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");

            Matcher matcher1 = pattern.matcher("abc@.com.my");
            if (matcher1.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");

            Matcher matcher2 = pattern.matcher("abc123@gmail.a");
            if (matcher2.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");

            Matcher matcher3 = pattern.matcher("abc123@.com");
            if (matcher3.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");

            Matcher matcher4 = pattern.matcher("abc123@.com.com");
            if (matcher4.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher5 = pattern.matcher(".abc@abc.com");
            if (matcher5.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher6 = pattern.matcher("abc()*@gmail.com");
            if (matcher6.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher7 = pattern.matcher("abc..2002@gmail.com");
            if (matcher7.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher8 = pattern.matcher("abc.@gmail.com");
            if (matcher8.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher9 = pattern.matcher(" abc@gmail.com.1a");
            if (matcher9.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher10 = pattern.matcher("abc@%*.com");
            if (matcher10.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
            Matcher matcher11 = pattern.matcher("abc@gmail.com.aa.au");
            if (matcher10.find())
                System.out.println("valid mail id");
            else
                System.out.println("invalid mail id");
        }

        }
}
