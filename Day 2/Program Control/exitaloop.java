package day2;

import java.util.Scanner;

public class exitaloop {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++) {
			int n=s.nextInt();
			if(n!=0) {
				sum+=n;
			}
			else {
				break;
			}
		}
		System.out.println(sum);
		
}

}
