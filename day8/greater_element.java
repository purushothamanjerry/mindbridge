package day8;

public class greater_element {
	
	public static void main(String[] args) {
	
		int nums[] = {4, 5, 2, 10};  
		
		for(int i=0;i<nums.length;i++) {
			int c=0;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					nums[i]=nums[j];
					c=1;
					break;
				}else {
					continue;
				}
				
			}
			if(c==0) {
				nums[i]=-1;
			}
			
		}
		
		for(int i:nums) {
			System.out.print(i+" ");
		}

		
	}

}
