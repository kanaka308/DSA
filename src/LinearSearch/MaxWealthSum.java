package LinearSearch;

public class MaxWealthSum {
    public static void main(String[] args) {
        int[][] personWealth = {{1,2,3},
                {1,2,1},
                {1,4}};
        System.out.println(wealthMax(personWealth));
    }
    static int wealthMax(int[][] arr){
        int ans = Integer.MIN_VALUE;

        for(int [] ints : arr){
            int sum = 0;
            for(int anInt : ints){
                sum += anInt;

            }
            if (sum > ans){
                ans = sum;
            }
        }




        return ans;




    }

}
