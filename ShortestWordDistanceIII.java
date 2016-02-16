package com.leetcode.array;

public class ShortestWordDistanceIII {
	public static void main(String[] args){
		String[] words = {"the", "quick", "brown", "fox", "quick"};
		System.out.println(shortestWordDistance(words, "quick", "quick"));
	}
	
	public static int shortestWordDistance(String[] words, String word1, String word2) {
        int first = -1;
        int second = -1;
        boolean dup = false;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < words.length; i ++){
        	if(words[i].equals(word1) && (!word1.equals(word2))){
        		first = i;
        	} else if(words[i].equals(word1) && (word1.equals(word2)) && !dup){
        		first = i;
        		dup = true;
        	}else if(words[i].equals(word2)){
        		second = i;
        		dup = false;
        	}
        	
        	if(first != -1 && second != -1 && first != second){
        		min = Math.min(min, Math.abs(first - second));
        	}
        	
        	if(word1.equals(word2) && (first != -1) && (second != -1) && !dup){
        		first = second;
        		dup = true;
        	}
        	
        }
        return min;
    }
}
