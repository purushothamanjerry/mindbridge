package Day13;
import java.util.*;
public class Factorial {
	
	public int fact;
	public int factorial(int num) {
		
		 fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial f=new Factorial();
		
		System.out.println(f.factorial(5));

	}

}
