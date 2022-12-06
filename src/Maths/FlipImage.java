package Maths;
//GOOGLE question

import java.util.Arrays;

public class FlipImage {

    public int[][] flipAndInvertImage(int[][] image){
        for(int[] row : image){
            //reverse the array;
            for (int i = 0; i < (image[0].length + 1) /2; i++){
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[image.length-1-i];
                row[image[0].length - i - 1] = temp;
            }


        }
        return image;
    }
}

