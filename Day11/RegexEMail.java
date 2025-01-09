package Day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEMail {
	
	
	public static void main(String[] args) {
        String[] name= {"user@example.com","user.name@domain.org","invalid-email@domain","user@domain_net","@missinguser.com"};
       String exp="^[a-zA-Z0-9][a-zA-Z0-9.-_]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
       Pattern pattern = Pattern.compile(exp);
       for(String s:name){
           {
               Matcher matcher = pattern.matcher(s);
               if(matcher.matches())
                   System.out.println(s+": "+"Valid");
               else
                   System.out.println(s+": "+"Invalid");
           }
       }
    }
}


