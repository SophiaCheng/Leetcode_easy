package com.leetcode.array;
import java.util.*;


public class PascalTriangle_2 {
	public static void main(String[] args){
		int num = 12;
		 List<Integer> result = getRow(num);
		System.out.println(result);
	}
	
	
	 public static List<Integer> getRow(int rowIndex) {
		 if ( rowIndex == 0) {
			 List<Integer> result0 = new ArrayList<Integer> ();
			 result0.add(1);
			 return result0;
		 }
		 
		 if ( rowIndex == 1) {
			 List<Integer> result1 = new ArrayList<Integer> ();
			 result1.add(1);
			 result1.add(1);
			 return result1;
		 }
		 
		 List<Integer> result = new ArrayList<Integer> ();
		 result.add(1);
		 List<Integer> preResult = getRow(rowIndex -1 );
		 for (int i = 1; i < rowIndex; i ++){ 
			 result.add(preResult.get(i - 1) + preResult.get(i)); 
		 }
		 result.add(1);
		 return result;
	}
}
