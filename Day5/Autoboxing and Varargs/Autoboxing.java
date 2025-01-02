package day4;

import java.util.*;

public class Autoboxing {
	
	
	public static void main(String[] args) {
		
		List<Integer>numbers=new ArrayList();
		numbers.add(10);
		numbers.add(4);
		numbers.add(20);
		numbers.add(7);
		numbers.add(9);
		int sum=0;
		for(Integer i:numbers) {
			sum+=i;
		}
		
		System.out.println(sum);
		
	}

}
