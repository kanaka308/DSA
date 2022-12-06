package LinearSearch;

import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int [][] arr = {
                {100,200,300,400},
                {1,2,3,4},
                {5,6,7,8,9,0,12},
                {89,88,87,85,67},
                {12,45,67,89,-2,-998}
        };
        int target = 67;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

        int maxans = max(arr);
        System.out.println(maxans);

    }

    static int[] search(int[][] arry, int target) {
        for(int row = 0; row < arry.length; row++) {
            for (int col = 0; col < arry[row].length; col++) {
                if (arry[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //max in 2d array

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
