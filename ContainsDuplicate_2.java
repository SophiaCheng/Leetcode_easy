package com.leetcode.array;
import java.util.*;

/*
 * Given an array of integers and an integer k, find out whether there there are two distinct indices
 *  i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 *  使用hashmap 
 */

public class ContainsDuplicate_2 {
	public static void main(String[] args){
		int[] test = {1,2,3,4,5,2};
		System.out.println(containsNearbyDuplicate(test, 3));
	}
	
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for (int i = 0; i < nums.length; i ++){
			 if (!map.containsKey(nums[i])) {
				 map.put(nums[i] , i);
			 } else {
				 if (i - map.get(nums[i]) <= k){
					 return true;
				 }
				 map.put(nums[i] ,i); //如果相距超過k, 更新此位置為新的起點 e.g. {1,0,1,1}, k = 1. 第一隊“1” 不符合，第二隊“1” 符合
			 }
		 }
		 return false;
    }
}
