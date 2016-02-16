package com.leetcode.array;

public class PlusOne {
	public static void main(String[] args){
		int[] test = {9,9};
		int[] result= plusOne(test);
		for (int i = 0; i < result.length; i ++){
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] plusOne(int[] digits) {
		 final int ONE = 1;
		 
		 for(int i = digits.length -1; i >= 0; i--){
			 digits[i] = digits[i] + ONE;
			 if(digits[i] < 10) {
				 return digits;
			 } else {
				 digits[i] = 0;
			 }
		 }
		 
		 int[] result = new int[digits.length +1];
		 result[0] = 1;
		 System.arraycopy(digits, 0, result, 1,digits.length);
		 return result;
	}

}
