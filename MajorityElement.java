package com.leetcode.array;

public class MajorityElement {
	public static void main(String[] args){
		int[] test = {1,2,2,3,2};
		System.out.println(majorityElement(test));
	}
	
	
  public  static int majorityElement(int[] nums) {
	 if (nums.length == 1) return nums[0];
     int majorIndex = 0;
     int count = 1;
     
     for (int i = 1; i < nums.length; i ++){
    	if (nums[i] == nums[majorIndex]){ 
    		count ++;
    	} else {
    		count --;
    		if (count == 0){
    			majorIndex = i;
    			count = 1;
    		}
    	}
     }
     return nums[majorIndex];
    }
}
