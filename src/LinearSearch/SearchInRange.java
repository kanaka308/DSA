package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        //q1:search in an array of size 7 in a range 2 to 5
        int arr[] = {1,2,4,6,7,9,67,32};
        System.out.println(searchInRange(arr, 6));
        }

        static int searchInRange(int[] array, int target){
            if (array.length == 0){
                return -1;
            }
            for (int index = 2; index <= 5; index++){
                int element = array[index];
                if (element == target){
                    return index;
                }
            }





            return -1;
        }


    }

