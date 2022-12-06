package Maths;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check:  ");

        int number = sc.nextInt();
        System.out.println(everOrOdd(number));

    }

    static boolean everOrOdd(int n) {
        return (n & 1) != 1;

    }

}



