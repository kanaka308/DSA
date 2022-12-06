package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixBinarySearch {
    public static void main(String[] args) {

        int[][] matrix = {{1,3,5,7},
                {2,4,6,8},
                {9,11,13,15},
                {10,12,14,16}};
        int[] ans = matrixSearch(matrix,6);
        System.out.println(Arrays.toString(ans));


    }
    static int[] matrixSearch(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;
        while(row<matrix.length && col > 0){
            if (matrix[row][col] == target){
                return new int[]{row, col};
            }
            if (matrix[row][col] < target){
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1,-1};
            



    }
}
