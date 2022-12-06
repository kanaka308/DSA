package Maths;

import com.sun.source.tree.BreakTree;

public class FindBit {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(findBit(a,4));

    }
    static int findBit(int number, int bit){
        int mask = 1 << bit-1;


        int ans = number&mask;

        return ans>>bit-1;
    }
}
