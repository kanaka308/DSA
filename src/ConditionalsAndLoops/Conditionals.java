package ConditionalsAndLoops;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //Q: print number from 1 to 100

        for(int i = 0; i<101; i++){
            System.out.println(i);

        }

        //while loops

        //Q: print numbers 1 to n

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int i = 1;
        while(i != n){
            System.out.println(i);
            i++;
        }

        //do while
        int x = 1;
        do{
            System.out.println("Hello world");
        }while(x != 1);

    }
}
