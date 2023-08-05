package com.company.Day3;
//  https://leetcode.com/problems/majority-element-ii/

import java.util.ArrayList;
import java.util.List;
public class MajorityElement2 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElementII(nums));

    }
     static List<Integer> majorityElementII(int[] nums){
        List<Integer> ans = new ArrayList<>();
        if(nums.length == 0)
            return ans;

        int ele1 = Integer.MAX_VALUE, cnt1 = 0, ele2 = Integer.MAX_VALUE, cnt2 = 0;
        for(int i =0; i<nums.length ;i++) {
            if (nums[i] == ele1)
                cnt1++;
            else if (nums[i] == ele2)
                cnt2++;
            else if (cnt1 == 0) {
                ele1 = nums[i];
                cnt1 = 1;
            } else if (cnt2 == 0) {
                ele2 = nums[i];
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == ele1)
                cnt1++;
            else if (nums[i] == ele2)
                cnt2++;
        }
        if(cnt1 > nums.length /3)
            ans.add(ele1);
        if(cnt2 > nums.length /3)
            ans.add(ele2);

        return ans;
     }

}
