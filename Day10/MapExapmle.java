package day10;

import java.util.*;

public class MapExapmle {

	public static void main(String[] args) {
		

		Map<String,Integer>sg=new HashMap<String,Integer>();
		sg.put("Alice", 85);
		sg.put("Bob", 90);
		sg.put("Charlie", 88);
		sg.replace("Bob", 92);
		System.out.println("Alice's grade: "+sg.get("Alice"));
		System.out.println("All students and grades:");
		
		for(String s:sg.keySet()) {
			
			System.out.println(s+":"+sg.get(s));
			
		}
		
	
	}

}
