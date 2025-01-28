package day6;
import java.util.Scanner;

public class Exceptional_Handling {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter the first integer: ");
	            int numerator = Integer.parseInt(scanner.nextLine());

	            System.out.print("Enter the second integer: ");
	            int denominator = Integer.parseInt(scanner.nextLine());

	            int result = numerator / denominator;
	            System.out.println("Result: " + result);

	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Please enter valid integers.");
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred.");
	        } finally {
	            System.out.println("Program execution completed.");
	        }
	    }
	}



