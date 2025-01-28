package day9;

import java.util.Hashtable;

public class ContactDirectory {

	public static void main(String[] args) {
    
		Hashtable<String,Long>cd=new Hashtable<String,Long>();
		
		
	
		cd.put("John", 9876543210L);
		cd.put("Alice", 9123456780L);
		cd.put("Bob",8899776655L);
		
		
		System.out.println("Contact Directory:");
		System.out.println(cd);
		long a=cd.get("Alice");
		System.out.println("Search Result for Alice:"+a);
		
		cd.remove("Bob");
		System.out.println("After Removal:");
		
		System.out.println(cd);


		
	}

}
