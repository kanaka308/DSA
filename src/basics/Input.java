package basics;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entered num is"+input.nextInt());
        System.out.print("Enter Something: ");
        int a = input.nextInt();
        System.out.println ("your input is " + a);
        System.out.print(("Enter name: "));
        String name = input.next();
        System.out.println(name);
        float marks = input.nextFloat();
    }

}
