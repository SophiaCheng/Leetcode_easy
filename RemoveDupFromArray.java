package com.leetcode.array;

public class RemoveDupFromArray {
	public static void main(String[] args) {
		int[] test = {1,2};
		System.out.println (removeDuplicates(test));
		
	}
	
	
	public static int removeDuplicates(int[] nums) {
		int i = 0;
		int j = 0;
		int length = 0;
		
		while (i < nums.length ){
			while(j < nums.length && nums[j] == nums[i]){
				j ++;
			}
			nums[length] = nums[i];
			length ++;
			i = j;
		}
		return length;
	}
}
