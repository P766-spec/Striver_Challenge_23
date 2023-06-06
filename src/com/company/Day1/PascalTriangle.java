package com.company.Day1;
// https://leetcode.com/problems/pascals-triangle/
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 6;
        List<List<Integer>> pascal = generate(numRows);
        for(List<Integer> row : pascal){
            for(Integer num : row){
                System.out.println(num + " ");
            }
            System.out.println();
        }

    }

        static  List<List<Integer>> generate(int numRows) {
            List<List<Integer>> triangle = new ArrayList<List<Integer>>();
            if (numRows <=0){
                return triangle;
            }
            for (int i=0; i<numRows; i++){
                List<Integer> row =  new ArrayList<Integer>();
                for (int j=0; j<i+1; j++){
                    if (j==0 || j==i){
                        row.add(1);
                    } else {
                        row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                    }
                }
                triangle.add(row);

            }
            return triangle;

    }
}
