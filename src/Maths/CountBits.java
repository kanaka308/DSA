package Maths;

public class CountBits {
    public static void main(String[] args) {
//        System.out.println(countBit(7));

        //One Single formula for counting bits is by using log;

        int number = 12345;
        int base = 10;
        int ans = (int)(Math.log(number)/Math.log(base)) + 1;
        System.out.println(ans);


    }
    static int countBit(int num){
        int count = 0;
        while(num > 0){

            num >>= 1;
            count += 1;
        }
        return count;

    }
}
