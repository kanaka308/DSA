package Maths;

public class Xor {
    public static void main(String[] args) {
        int start = 3;
        int end = 9;
        int ans = xor(end) ^ xor(start-1);
        System.out.println(ans);
    }

    //xor 0 to n;
    static int xor(int n){
        if (n % 4 == 0){
            return n;
        }
        if (n % 4 == 1){
            return 1 ;
        }
        if (n % 4 == 2){
            return n + 1;
        }
        return 0;
    }
}
