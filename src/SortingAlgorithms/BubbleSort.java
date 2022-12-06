package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ary = {4,5,6,7,2};
        bubble(ary);
        System.out.println(Arrays.toString(ary));

    }

    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            for (int j = 1; j<arr.length-i; j++){
                if (arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                    swapped = true;
                }
            }
        if (!swapped){
            break;
        }
        }
        }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

