package day10;

import java.util.*;

public class Stackexample {
	
	
	public static void main(String[] args) {
		
		Stack<String>s=new Stack<String>();
		s.push("Hello");
		s.push("World");
		s.pop();
		s.add("Java");
		for(String h:s) {
			System.out.print(h+" ");
		}
	}

}
