package LinearSearch;

public class CountDigits {
    public static void main(String[] args) {
        int[] arr = {12,3,4567,1234,90,56};
        int ans = digitCount(arr);
        System.out.println(ans);
    }

    static int digitCount(int[] arr){
        int count = 0;
        for(int element : arr){
            int digits = 0;
            while (element != 0){
                element /= 10;
                digits += 1;

            }
            if (evenrOdd(digits)){
                count+=1;
            }





        }
        return count;
    }
    static boolean evenrOdd(int num){
        if (num % 2 ==0){
            return true;
        }
        return false;
    }

}
