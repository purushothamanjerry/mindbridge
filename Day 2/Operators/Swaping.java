package day2;

import java.util.Scanner;

public class Swaping {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter they value of A");
		int a=s.nextInt();
		System.out.println("Enter they value of B");
		int b=s.nextInt();
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("A is :"+a);
		System.out.println("B is :"+b);
		
	}
	

}
