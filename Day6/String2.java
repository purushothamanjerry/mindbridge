package day6;

import java.util.Scanner;


public class String2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();

        String secondString = scanner.nextLine();

        int comparisonResult = firstString.compareTo(secondString);

        boolean isEqualCaseSensitive = firstString.equals(secondString);
        boolean isEqualCaseInsensitive = firstString.equalsIgnoreCase(secondString);

        String concatenatedString = firstString + secondString;

        System.out.println("Lexicographical comparison result: " + comparisonResult);
        System.out.println("Are strings equal (case-sensitive)? " + isEqualCaseSensitive);
        System.out.println("Are strings equal (case-insensitive)? " + isEqualCaseInsensitive);
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
