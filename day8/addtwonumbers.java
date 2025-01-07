package day8;

public class addtwonumbers {

	public static void main(String[] args) {
		
		
		int nums[]= {2,7,11,15};
		int target=9;
		int s=0;
		int e=0;
		int count=0;
		//i=start
		//j=end
		for(int i=0;i<nums.length;i++) {
			if(count==1)
				break;
			int sum=0;
			for(int j=0;j<nums.length;j++) {
				if(i==j) {
					continue;
				}else{
				s=i;
				if(nums[i]+nums[j]==target) {
					e=j;
					count++;
					System.out.println("["+s+","+e+"]");
					break;
				}
			}
		}}


	}

}
