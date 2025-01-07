package day8;

import java.util.*;

public class contiguous_subarray {

	public static void main(String[] args) {

		int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		
		int max =nums[0], current=nums[0];
		 for (int i = 0; i < nums.length; i++) {
			 System.out.println(nums[i]);
			current=Math.max(nums[i],current+nums[i]);
			System.out.print(":"+current);
			max=Math.max(current,max);
			System.out.print(" "+max+":");
		}
		System.out.println(max);

	}

}
