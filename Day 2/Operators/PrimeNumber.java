package day2;

import java.util.Scanner;

public class primenumber {
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();//7
		boolean isprime=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				isprime=false;
				break;
			}
			
		}
		System.out.println(isprime==true?a+" is prime number":a+" is not a prime number");
		
	}

}
 
