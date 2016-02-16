package com.leetcode.array;

public class ShortestWordDistance {
	public int shortestDistance(String[] words, String word1, String word2) {
		 int first = -1;
		 int second = -1;
		 int min = Integer.MAX_VALUE;
		 for(int i = 0; i < words.length; i ++){
			 if(words[i].equals(word1)){
				 first = i;
			 } else if(words[i].equals(word2)){
				 second = i;
			 }
			 
			 if(first != -1 && second != -1){
				 min = Math.min(min, Math.abs(first - second));
			 }
		 }
		 return min;
    }
}
