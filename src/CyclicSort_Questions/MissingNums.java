package CyclicSort_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNums {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex] && arr[i] < arr.length) {
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index + 1){

                list.add(index+1);
            }
        }
        return list;

    }
    static void swap ( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
