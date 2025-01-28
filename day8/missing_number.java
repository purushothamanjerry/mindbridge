package day8;
import java.util.*;
public class missing_number {
	
	
	
	public static void main(String[] args) {
		
		int nums[]= {1,0,3};
		
		Arrays.sort(nums);
		int min=nums[0];
		for (int i = 0; i < nums.length; i++) {
			
		if(nums[i]==min) {
			min++;
			continue;
			
		}else {
			System.out.println(min);
			break;
		}
		
		}
		
		
	}

}
