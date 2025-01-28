package Day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegMail {

	public static void main(String[] args) {
		
		String []gmail= {"user@example.com","user.name@domain.org","invalid-email@domain","user@domain_net","@missinguser.com"};
		String f="^[a-zA-Z0-9][a-zA-Z0-9.-_]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
		Pattern p=Pattern.compile(f);
		
		for(String s:gmail) {
			Matcher m=p.matcher(s);
			if(m.matches()) {
				System.out.println(s+":"+" "+"Valid");
			}else {
				System.out.println(s+":"+" "+"InValid");
			}
		}
		
	}

}
