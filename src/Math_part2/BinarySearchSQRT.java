package Math_part2;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        System.out.printf("%.3f", bibarySqrt(40,3));
    }
    static double bibarySqrt(int n, int p){
        double precision = 0.0;
        int start = 1;
        int end = n;

        double root = 0.0;

        while(start < end){
            int mid = start + (end - start)/2;
            if (mid*mid == n){
                root = mid;
                return mid;
            }
            if (mid*mid > n){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }




        }
        double incr = 0.1;
        for (int i = 0; i <= p; i++){
            while (root*root <= n){
                root += incr;
            }

            root -= incr;
            incr /= 10;


        }
        return root;
    }
}
