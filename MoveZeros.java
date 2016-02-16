package com.leetcode.array;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1){
        	return;
        }
        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
        	if(nums[fast] != 0){
        		nums[slow ++] = nums[fast];
        	}
        	fast ++;
        }
        while(slow < nums.length){
        	nums[slow ++] = 0;
        }
    }
}
