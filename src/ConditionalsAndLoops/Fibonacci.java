package ConditionalsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        for(int i=0; i<num;i++){
            int fib = a + b;
            a = b;
            b = fib;



        }
        System.out.println(a);

    }
}
