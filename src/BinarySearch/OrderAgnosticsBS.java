package BinarySearch;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int [] ary = {1,2,3,4,5,12,15};
        int target = 12;
        System.out.println(orderAgnosticsBS(ary, target));
        int[] ary2 = {100,99,88,77,66,5,3,2-234};
        System.out.println(orderAgnosticsBS(ary2, 88)) ;
        
    }
    static int orderAgnosticsBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        
        boolean isAsc = arr[start] < arr[end];
        
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }

            }
                


        }
        
        
        return -1;
    }
    
}
