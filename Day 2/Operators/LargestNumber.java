package day2;

import java.util.Scanner;

public class LargestNumber {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		System.out.println(a>b&&a>c?a:b>a&&b>c?b:c);
		
	}

}
