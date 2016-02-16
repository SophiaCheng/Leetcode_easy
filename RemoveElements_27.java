package com.leetcode.array;
import java.util.*;

public class RemoveElements_27 {
	public int removeElement(int[] nums, int val) {
	   List<Integer> l = new ArrayList<Integer>();
	   for (int i = 0; i < nums.length; i++){
		   if (nums[i] != val) {
			   l.add(nums[i]);
		   }
	   }
	   return l.size();  
    }
}
