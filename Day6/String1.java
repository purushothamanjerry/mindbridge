package day6;
import java.util.Scanner;

public class String1 {
	
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        String[] words = sentence.trim().split("\\s+");
	        int wordCount = words.length;

	        String reversedSentence = new StringBuilder(sentence).reverse().toString();

	        String replacedVowels = sentence.replaceAll("[AEIOUaeiou]", "*");

	        System.out.println("Number of words: " + wordCount);
	        System.out.println("Reversed sentence: " + reversedSentence);
	        System.out.println("Sentence with vowels replaced: " + replacedVowels);
	    }
	}



