package day2;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact*=i;
		}
		System.out.println(fact);

	}

}
