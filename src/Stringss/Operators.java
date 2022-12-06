package Stringss;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a" + 'b');
        System.out.println((char)('a' + 5));
        System.out.println("a" + 100);
        System.out.println("Shiva" + new Integer(100));
        System.out.println("Shivaa" + new ArrayList<>());
        //System.out.println(new ArrayList<>() + new Integer(100));//gives error
        System.out.println(new ArrayList<>() + " " + new Integer(7));
    }
}
