package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(4);
        list.add(5);
        list.add(63);
        list.add(567);
        System.out.println(list);

        ArrayList<Integer> shivlist = new ArrayList<>();
        shivlist.add(5);
        shivlist.add(100);
        System.out.println(shivlist);

        for (int i = 0; i < 5; i++) {
            shivlist.add(sc.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(shivlist.get(i));
        }
    }
}
