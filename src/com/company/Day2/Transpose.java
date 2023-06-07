package com.company.Day2;
// in place
public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        int m = matrix.length;
        int n = matrix[0].length;

        transposeMatrix(matrix, m, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }
    private static void transposeMatrix(int[][] matrix, int m ,int n){
        for(int i = 0; i<n; i++){
            for(int j = i + 1; j < m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

}
