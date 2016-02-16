package com.leetcode.array;
 
public class RotateArray {
	public void rotate(int[] nums, int k) {
         if(nums == null || nums.length == 0){
        	 return;
         }
         k = k % nums.length;
         if(k == 0){
        	 return;
         }
         rotate(nums, 0, nums.length - k - 1);
         rotate(nums, nums.length - k, nums.length - 1);
         rotate(nums, 0, nums.length - 1);
    }
	
	private static void rotate(int[] array, int left, int right){
		while(left < right){
			swap(array, left, right);
			left ++;
			right --;
		}
	}
	private static void swap(int[] array, int left, int right){
		int tmp = array[left];
		array[left] = array[right];
		array[right] =  tmp;
	}
}
