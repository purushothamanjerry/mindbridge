package day7.additionals;


	import java.util.*;

	public class numberofString {

			    public static int countSubstrings(String[] patterns, String word) {
	        int count = 0;
	        for (String pattern : patterns) {
	            if (word.contains(pattern)) { 
	                count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        
	        String[] patterns = {"a", "abc", "bc", "d"};
	        String word = "abc";
	        System.out.println(countSubstrings(patterns, word));
	    }
	}

	
