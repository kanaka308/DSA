package Maths;

public class Occurance {
    public static void main(String[] args) {
        int[] arr = {11,11,2,2,3,9,5,5,3};
        System.out.println(occurance(arr));

    }
    static int occurance(int[] arr){
        int unique = 0;
        for (int element : arr){
            unique ^= element;

        }
        return unique;
    }
}
