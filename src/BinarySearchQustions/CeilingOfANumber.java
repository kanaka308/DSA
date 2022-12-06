package BinarySearchQustions;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] ary = {1,2,3,4,5,7,8};
        int ans = ceiling(ary,6);
        System.out.println(ans);

    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < target){
                start = mid + 1;
            }
            if (mid > target){
                end = mid - 1;
            }
            return mid;



            }



        return start;
    }
}
