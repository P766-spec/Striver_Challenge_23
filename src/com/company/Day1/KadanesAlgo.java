package com.company.Day1;
// https://leetcode.com/problems/maximum-subarray/
import java.util.*;
public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;;
        long maxi= maxSubarraySum(arr,n);
        System.out.println("The maximum subaaray sum is: " + maxi);
    }
    static long maxSubarraySum(int[] arr, int n){
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
}
