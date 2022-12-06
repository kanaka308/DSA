package ConditionalsAndLoops;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while(num > 0){

            int rem = num % 10;
            num = num/10;

            if (rem == 3){
                count += 1;
            }




        }
        System.out.println(count);


    }
}
