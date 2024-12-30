package day3p;

public class sumofall {
	
	
	public static int sum(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int a[]= {2,4,6,1,6,8,1,2};
		
		System.out.println(sum(a)); 
		

}
	}
