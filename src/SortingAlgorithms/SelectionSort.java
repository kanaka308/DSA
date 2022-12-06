package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ary = {4,5,7,8,9};
        selection(ary);
        System.out.println(Arrays.toString(ary));

    }

    static void selection(int arr[]){
        for (int i = 0; i< arr.length; i++){
            int lastIndex = arr.length-i-1;
            int maxIndex = maxItem(arr, 0,lastIndex);
            swap(arr, lastIndex, maxIndex);
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int maxItem(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    }

