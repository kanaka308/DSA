package BinarySearch;

public class BinarySearchExample {
    public static void main(String[] args) {
        int [] eg = {1,2,3,4};
        int target = 3;
        System.out.println(binarySearch(eg, target));


    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            int mid = (start+end)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }


        }

        return -1;
    }
}
