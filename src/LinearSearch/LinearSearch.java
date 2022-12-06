package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ary = {1,2,3,4,5,6,7};
        int tar = linearSearch(ary,7);
        System.out.println(tar);
    }

    static int linearSearch(int arr[], int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }

        return -1;

    }
}
