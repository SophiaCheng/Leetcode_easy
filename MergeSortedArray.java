package com.leetcode.array;

public class MergeSortedArray {
	public static void main(String[] args){
		int m = 3;
		int n = 3;
		int[] nums1 = new int[10];
		int[] nums2 = {2,3,4};
		
		nums1[0] = 1;
		nums1[1] = 3;
		nums1[2] = 5;
		
		merge(nums1,m,nums2,n);
		System.out.println();
		for (int i = 0; i < nums1.length; i++){
			System.out.print(nums1[i] + " ");
		}
	
	}
	
	
	
	public  static void merge(int[] nums1, int m, int[] nums2, int n) {
	  int[] helpArr = new int[m];
	  System.arraycopy(nums1,0,helpArr,0,m);
	  int i = 0;
	  int j = 0;
	  
	  if (m == 0) {
		  System.arraycopy(nums2,0, nums1,0, n);
		  return;
	  }
	  else if (n == 0) return;
	  else {
		  int length = 0;
		  while (i < m && j < n){
			  if (helpArr[i] > nums2[j]){
				nums1[length ++] = nums2[j ++];
			  }else {
				  nums1[length ++] = helpArr[i ++];
			  }
		  }
		  if (i >= m) {
			  while (j < n){
				  nums1[length ++] = nums2[j ++];
			  }
		  }
		  else {
			  while (i < m){
				  nums1[length ++] = helpArr[i ++];
			  }
		  }
	  }
    }
}
