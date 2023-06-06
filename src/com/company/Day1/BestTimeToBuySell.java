package com.company.Day1;
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
import java.awt.geom.FlatteningPathIterator;
import java.sql.Array;
import java.util.*;
public class BestTimeToBuySell {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};

        int max = maxProfit(arr);
        System.out.println("Max Profit is:  " + max);
    }
    static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            max = Math.max(max, prices[i] - min);

        }
        return max;

    }
}
