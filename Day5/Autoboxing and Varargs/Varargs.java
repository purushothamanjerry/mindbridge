package day4;

public class Varargs {
	
	public static void sum(int...numbers) {
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
		System.out.println(sum);
	}
	 public static void main(String[] args) {
		 
		 sum(1,2,3);
		 sum(8,7,6);
	}
	

}
