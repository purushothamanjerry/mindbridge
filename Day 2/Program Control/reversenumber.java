package day2;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=0;
		for(int i=n;i>0;i/=10) {
			temp=i%10;
			System.out.print(temp);
		}

	}

}
