package day10;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {


		Queue<String>Support=new LinkedList<String>();
		Support.add("Alice");
		Support.add("Bob");
		Support.add("Charlie");
		
		System.out.println("Serving: "+Support.peek());
		Support.poll();
		System.out.println("Waiting: "+Support);

	}

}
