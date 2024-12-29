package day2;

public class skip5multiples{
	
	public static void main(String[] args) {
		
		for(int i=0;i<100;i++) {
			
			if(i%5!=0) {
				System.out.print(i+" ");
			}else {
				continue;
			}
			
		}
	
	}
	

}
