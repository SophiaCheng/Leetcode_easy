package com.leetcode.array;
import java.util.*;

public class PascalTriangle {
	public static void main(String[] args){
		int num = 5;
		List<List<Integer>> result = generate(num);
		System.out.println(result);
	}
	
	
	public static List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> totalCases = new  ArrayList<List<Integer>>();
		 
		 
		 if (numRows == 1) {
			List<Integer> eachCase = new ArrayList<Integer>();
			eachCase.add(1);
			totalCases.add(eachCase);
			return totalCases;
		 }
		 
		 if(numRows == 2){
			 List<Integer> temp1 = new ArrayList<Integer>();
			 List<Integer> temp2 = new ArrayList<Integer>();
			 
			 temp1.add(1);
			 totalCases.add(temp1);
			 temp2.add(1);
			 temp2.add(1);
			 totalCases.add(temp2);
			 
			 return totalCases;
		 }
		 
		 List<List<Integer>> rowCase = new ArrayList<List<Integer>>();
		 rowCase = generate(numRows - 1);
		 
		 List<Integer> eachCase = new ArrayList<Integer>();
		 eachCase.add(1);
		 for (int i = 0; i < numRows -2 ; i ++){
			 eachCase.add(rowCase.get(rowCase.size() - 1).get(i) + rowCase.get(rowCase.size() - 1).get(i + 1));
		 }
		 eachCase.add(1);
		 rowCase.add(eachCase);
		 return rowCase;
    }

 
}
