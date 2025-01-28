package day9;

import java.util.*;
import java.lang.*;

public class Students {

	public static void main(String[] args) {
		
		
		
		Vector <Integer>grade=new Vector<Integer>();
		
		grade.add(78);
		grade.add(85);
		grade.add(92);
		grade.add(67);
		grade.add(88);
		grade.remove(3);
		
		int max=Collections.max(grade);
		int min=Collections.min(grade);
		System.out.println(grade);
		
		System.out.println("Highest Grade:"+max);
		System.out.println("Lowest Grade:"+min);
		int sum=0;
		for(int i:grade) {
			sum+=i;
		}
		System.out.println((double)sum/4);
		
	}

}
