package Math_part2;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(newtorSqrt(40));

    }
    static double newtorSqrt(double n){

        double x = n;
        double root;


        while (true){
            root = 0.5 * (x + (n/x));


            if (Math.abs(root - x) < 1){
                break;
            }

            x = root;
        }
        return root;
    }
}
