package com.company.Day2;
// https://leetcode.com/problems/merge-intervals/

import java.util.*;
class Interval {
    int start;
    int finish;
    Interval(int start, int finish){
        this.start = start;
        this.finish = finish;

    }
}
public class mergeOverlappingIntervals {
    public static void main(String[] args) {
        Interval[] intervals = new Interval[5];
        intervals[0] = new Interval(1, 4);
        intervals[1] = new Interval(3, 5);
        intervals[2] = new Interval(6, 8);
        intervals[3] = new Interval(8, 9);
        intervals[4] = new Interval(10, 12);

        List<Interval> merged = mergeIntervals(intervals);

        System.out.println("Merged Intervals: ");
        for(Interval interval : merged){
            System.out.println(interval.start + " " + interval.finish);
        }


    }
    static List<Interval> mergeIntervals(Interval[] intervals) {
        List<Interval> mergedIntervals = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return  i1.start - i2.start;
            }
        });

        int start = intervals[0].start;
        int end = intervals[0].finish;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i].start <= end){
                end = Math.max(end,intervals[i].finish);
            }
             else {
                 mergedIntervals.add(new Interval(start, end));
                 start = intervals[i].start;
                 end = intervals[i].finish;
            }

        }
        mergedIntervals.add(new Interval(start, end));
        return  mergedIntervals;

    }

}
