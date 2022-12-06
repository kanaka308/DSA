package Stringss;


import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Shivanand Dhanagond";
        System.out.println(".length method gives length of string" + name.length());
        System.out.println(Arrays.toString(name.toCharArray()));// this method converts string to a character array;
        System.out.println(Arrays.toString(name.split(" ")));//splits string into arrays as mentioned;
        
    }
}
