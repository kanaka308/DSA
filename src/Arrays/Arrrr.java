package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrrr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i<arr.length-1; i++){

            arr[i] = sc.nextInt();
        }
//        for(int i = 0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        for(int num : arr){


            System.out.println(arr[num]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
