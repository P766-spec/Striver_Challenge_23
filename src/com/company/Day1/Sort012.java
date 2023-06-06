package com.company.Day1;
// https://leetcode.com/problems/sort-colors/

import java.util.*;
public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1,0, 1,2,1,2, 0, 0};
        int n = arr.length;
        sortArray(arr,n);
        for(int num : arr){
            System.out.println(num + " ");
        }

    }
    static void sortArray(int[] arr, int n){
        int low = 0, mid = 0, high = n - 1;

        while(mid <= high){     // unsorted portion
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else {
               swap(arr, mid, high);
               high--;

            }

        }
        }
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
