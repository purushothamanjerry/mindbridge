package day8;

public class rotate {
	
	public static void main(String[] args) {
		
	
	int nums[]= {1,2,3,4,5,6,7};
	int c=0;
	int k=3;
	for(int i=0;i<k;i++) {	
		
	int temp=nums[nums.length-1];
	for(int j=nums.length-1;j>=0;j--) {
		if(j==0) {
		nums[j]=temp;
		}else {
			nums[j]=nums[j-1];
		}}
	}
	for(int i:nums) {
		System.out.print(i+" ");
	}
   
	}

}
