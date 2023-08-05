package com.company.Day3;
// https://leetcode.com/problems/trapping-rain-water/

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));

    }

    static int trap(int[] arr){
        if(arr == null || arr.length == 0)
            return 0;

        int l = 0; int r = arr.length -1;
        int maxL = 0; int maxR = 0;
        int water = 0;

        while(l < r){
            if(arr[l] < arr[r]){
                if(arr[l] >= maxL){
                    maxL = arr[l];
                } else {
                    water += maxL - arr[l];
                }
                l++;
            } else {
                if(arr[r ]>= maxR){
                    maxR = arr[r];
                } else {
                    water += maxR - arr[r];
                }
                r--;
            }
        }
        return water;
    }
}
