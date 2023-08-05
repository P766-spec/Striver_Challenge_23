package com.company.Day3;
//https://leetcode.com/problems/majority-element/

import java.util.HashMap;
public class MajorityELement1 {
    public static void main(String[] args) {
        int[ ] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));


    }
    static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
            if(map.get(num) > nums.length /2){
                ans = num;
                break;
            }
        }
        return ans;
    }
}

// another method
//Arrays.sort(nums);
//return nums[nums.length/2];
