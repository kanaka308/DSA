package Arrays;



public class arraysexample {
    public static void main(String[] args) {
        //q: store a roll number
        // datatype[] variable_name = new datatype[size];
        int[] rnos1 = new int[5];
        rnos1[0] = 5;
        System.out.println(rnos1);
        int[] rnos2 = {23, 34, 45, 67, 78};
        System.out.println(rnos2);

        int[] ros; //declaration of array. ros is getting defined in the stack

        ros = new int[5]; //initialization: actually here object is being created in heap memory

        int[] arr = new int[5];
        System.out.println(arr[1]);
        String[] name = new String[5];
        System.out.println(name[4]);






    }


}
