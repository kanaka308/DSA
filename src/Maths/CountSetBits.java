package Maths;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(setBits(5));

    }
    static int setBits(int n){
        int count = 0;

//        while (n > 0){
//            count++;
//            n -= (n & -n);
//        }

        while (n > 0){
            count++;
            n = n & (n-1);
        }

        return count;
    }
}
