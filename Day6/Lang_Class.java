package day6;

public class Lang_Class {
	
	    public static void main(String[] args) {
	    	double number = 16;
	        double sqrt = Math.sqrt(number);
	        double power = Math.pow(2, 5);
	        int max = Math.max(1000, 2000);

	        System.out.println("Square root of: " +" " + sqrt);
	        System.out.println( power);
	        System.out.println("Maximum :"+" " + max);

	        String originalString = "Purushothamanjerry";
	        int length = originalString.length();
	        String upperCaseString = originalString.toUpperCase();
	        String substring = originalString.substring(5, 16);

	        System.out.println("Original String: " + originalString);
	        System.out.println("Length of the String: " + length);
	        System.out.println("String in Uppercase: " + upperCaseString);
	        System.out.println("Substring (5 to 16): " + substring);

	        long startTime = System.currentTimeMillis();

	        for (int i = 0; i < 1000000; i++) {
	        }

	        long endTime = System.currentTimeMillis();
	        System.out.println("Execution time for the loop: " + (endTime - startTime) + " milliseconds");
	    }
	}

	


