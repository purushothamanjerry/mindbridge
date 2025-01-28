package day9;

import java.util.*;

public class ShoppingList {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		list.add("Milk");
		list.add("Eggs");
		list.add("Bread");
		list.add("Butter");
		
		list.remove("Eggs");
		
		System.out.println("Shopping List: "+list);


	}

}
