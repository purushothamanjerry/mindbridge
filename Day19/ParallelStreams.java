package Day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		List<Integer>numbers=new ArrayList<>();
		for(int i=0;i<100;i++) {
			numbers.add(i);
		}
		
		List<Integer>result=tensqu(numbers);
		System.out.println(result);
		
	}
	
	public static List<Integer> tensqu(List<Integer>num) {
		return num.stream().parallel().filter(x-> x >50).map(x->x*x).limit(10).collect(Collectors.toList());
	}

}
