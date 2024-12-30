package day3p;
import java.util.*;
public class largestandsmallest {

		public static int smallest(int a[]) {
	
		//int[]a= {4,6,9,7,8,2};
		
		Arrays.sort(a);
		
		return a[0];
		}
		public static int largest(int a[]) {
			Arrays.sort(a);
			
			return a[a.length-1];
		}
		public static void main(String[] args) {
			
			int num1[]= {9,2,4,5,6,7,1};
			System.out.println(smallest(num1));
			System.out.println(largest(num1));
			
		}

}
