package com.leetcode.array;

public class RemoveDupFromArray_2 {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 1) return 1;
		if ( nums.length == 2) return 2;
		
		int i = 0;
		int j = 0;
		int length = 0;
		int count; //判断是否有2个重复的
		
		while (i < nums.length){
			count = 0;
			while (j < nums.length && nums[j] == nums[i]){
				j ++;
				count ++;
			}
			
			nums[length] = nums[i];
			length ++;
			
			//判断是否有2个重复的
			if (count >= 2) {
				nums[length ++] = nums[i];	
			}
			
			i = j;
		}
		return length;
    }
}
