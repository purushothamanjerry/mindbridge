package day2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Division");
		System.out.println("Multiplication");
		System.out.println("Modulus");
		
		System.out.println("Enter they operation");
		String operation=s.next();
		switch(operation) {
		case "Addition":
			System.out.println(num1 + num2);
			break;
		case "Subtraction":
			System.out.println(num1 - num2);
			break;
		case "Division":
			System.out.println(num1 / num2);
		case "Multiplication":
			System.out.println(num1 * num2);
		case "Modulus":
			System.out.println(num1 % num2);
			default:
				System.out.println("Give they correct operation");
		}
		
		
		
		
	}
}
