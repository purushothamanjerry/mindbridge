package day2;

import java.util.Scanner;

public class CountBinaryRepresentation {
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		 int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        System.out.println(count);
        
        
	}

}
