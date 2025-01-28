package day10;


import java.util.*;
public class LinkedListtask {

	public static void main(String[] args) {
		
		LinkedList<String>list=new LinkedList<String>();
		list.add("Finish homework");
		list.add("Go for a run");
		list.add("Prepare dinner");
		list.remove("Go for a run");
		
		int count=1;
		System.out.println("Task List: ");
		for(String s:list) {
			System.out.println(count+"."+" "+s);
			count++;
		}


	}

}
