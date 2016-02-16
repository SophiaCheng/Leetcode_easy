package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public static void main(String[] args){
		int[] nums = {0,1,2,4,5,7};
		System.out.println(summaryRanges(nums));
	}
	
	public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums == null || nums.length == 0){
        	return list;
        } else if(nums.length == 1){
        	list.add(Integer.toString(nums[0]));
        	return list;
        }
		int start = 0;
		int cur = 1;
		while(cur < nums.length){
			if(nums[cur] != nums[cur - 1] + 1){
				if(cur != start + 1){
					String tmp = new String(nums[start] + "->" + nums[cur - 1]);
					list.add(tmp);
				} else{
					String tmp = Integer.toString(nums[start]);
					list.add(tmp);
				}
				start = cur;
			}
			
			if(cur == nums.length - 1){
				if(cur != start){
					String tmp = new String(nums[start] + "->" + nums[cur]);
					list.add(tmp);
				} else{
					String tmp = Integer.toString(nums[start]);
					list.add(tmp);
				}
			}
			cur ++;
		}
		return list;
    }
}
