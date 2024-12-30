package day3p;

public class Counter {

	private static int count;
	
	public Counter() {
		count++;
	}
	public static int getcount() {
		return count;
	}
	
	
	public static void main (String[]args) {
		
		Counter object1=new Counter();
		Counter object2=new Counter();
		Counter object3=new Counter();
		
		System.out.println(getcount());
	}
	
}
