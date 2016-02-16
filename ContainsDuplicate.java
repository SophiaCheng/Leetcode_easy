package com.leetcode.array;
import java.util.*;


public class ContainsDuplicate {
	public static void main(String[] args){
		int[] test = {1,2,3,2};
		System.out.println(containsDuplicate_2(test));
	}
	
	// time limit exceeded
	public static boolean containsDuplicate(int[] nums) {
	       for (int i = 1; i < nums.length; i ++){ 
	    	   for (int j = i -1; j >= 0; j --){
	    		   if (nums[i] == nums[j]) return true;
	    	   }
	       }
	       return false;
	    }
	
	public static boolean containsDuplicate_2 (int[] nums){
		Set<Integer> numsSet = new HashSet<Integer>();
		for (int i: nums){
			if (!numsSet.add(i)) return true;
		}
		return false;
	}
}
