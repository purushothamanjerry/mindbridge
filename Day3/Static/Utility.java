package day3p;

public class Utility {
	
	public static String convertToUpper(String str) {
		if(str==null) {
			return null;
		}
		return str.toUpperCase();
	}
	
	public static void main(String[] args) {
		
		String input="purushothaman";
		System.out.println(convertToUpper(input));
	}
}
