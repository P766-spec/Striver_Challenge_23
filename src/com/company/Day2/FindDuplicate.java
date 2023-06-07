package com.company.Day2;
//  https://leetcode.com/problems/find-the-duplicate-number/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 4, 2, 2));
        int n = 5;
        int res = findDuplicate(arr, n);
        System.out.println(res);
    }

    static int findDuplicate(ArrayList<Integer> arr, int n) {
        Collections.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i).equals(arr.get(i + 1))) {
                return arr.get(i);
            }
        }
        return 0;
    }
}
