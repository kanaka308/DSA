package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class TwoDimensionalArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        int arr1[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9,90}
        };
        System.out.println(arr1[2][3]);

        int arr2[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < arr2.length; row++){
            for (int col = 0; col < arr2[row].length; col++){
                arr2[row][col] = sc.nextInt();
            }
        }
//        for (int row = 0; row < arr2.length; row++){
//            for (int col = 0; col < arr2[row].length; col++){
////                System.out.print(arr2[row][col] + " ");
//                System.out.println(Arrays.toString(arr2[row]));
//
//            }
//            System.out.println();
//        }

        for (int[] a:arr2){
            System.out.println(Arrays.toString(a));
        }



    }
}
