package Maths;

public class SetBit {
    public static void main(String[] args) {

    }
    static int setBit(int n, int bit){
        int mask = 1<<(bit-1);
        int ans = n|mask;

        return ans;


    }
}
