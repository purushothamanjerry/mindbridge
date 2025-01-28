package day9;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {

		
		Integer list[]= {1, 2, 3, 4, 5};
//		List<list>elements=new ArrayList<list>(Arrays.asList(elements));
		
		List<Integer> elements = new ArrayList<Integer>(Arrays.asList(list));
		
		//System.out.println(elements);

		Collections.reverse(elements);
		System.out.println("Reversed List: "+elements);
		


	}

}
