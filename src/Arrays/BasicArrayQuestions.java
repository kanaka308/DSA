package Arrays;

import java.util.Arrays;

public class BasicArrayQuestions {
    public static void main(String[] args) {
        //q1: swap two elements of an array
        //q2: max in an array
        //q3: reverse an array


        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

        System.out.println(maxx(arr));

        System.out.println("reversing");

        reverse(arr);
    }

    static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int arrr[], int i, int j){
        int temp = arrr[i];

        arrr[i] = arrr[j];
        arrr[j] = temp;

    }
    static int maxx(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }

        }
        return max;

    }
}
