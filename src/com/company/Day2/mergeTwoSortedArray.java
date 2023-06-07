package com.company.Day2;
//  https://leetcode.com/problems/merge-sorted-array/

import java.util.*;
public class mergeTwoSortedArray {
    public static void main(String[] args) {
        long[] arr1 = { 1, 4, 8, 10};
        long[] arr2 = { 2, 3, 9};
        int n = 4;
        int m = 3;
        mergeArrays(arr1,arr2,n,m);
        System.out.println("The merged Arrays are: ");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m ; i++) {
            System.out.print(arr2[i] + " ");

        }
        System.out.println();

    }
     public static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
         if(arr1[ind1] > arr2[ind2]){
             long temp = arr1[ind1];
             arr1[ind1] = arr2[ind2];
             arr2[ind2] = temp;
         }
     }

     static void mergeArrays(long[] arr1, long[] arr2, int n, int m){
         int len = n + m;
         int gap = (len /2) + (len % 2);

         while ( gap > 0){
             int left = 0;
             int right  = left + gap;
             while( right < len){
                 //  left in arr1, right in arr2
                 if(left < n && right >= n){
                     swapIfGreater(arr1, arr2, left, right - n);
                 }
                 // both left, right in arr2
                 else if(left >= n){
                     swapIfGreater(arr2, arr2, left - n, right - n);
                 }
                 // both left, right in ar1
                 else {
                     swapIfGreater(arr1, arr1,left, right);
                 }
                 left++;
                 right++;
             }
             if(gap == 1) break;
             gap = (gap / 2) + (gap % 2);
         }
     }

}
