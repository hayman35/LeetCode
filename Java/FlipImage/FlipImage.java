package FlipImage;

import java.util.Arrays;

// https://leetcode.com/problems/flipping-an-image/
public class FlipImage {

    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image[0].length; i++){
            int start = 0;
            int end = image[0].length - 1;
            while (start <= end){
                int temp = 1 - image[i][start]; // while reversing matrix we just subtract one to also invert the 0 to 1 and vise versa
                image[i][start] = 1 - image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        return image;
    }
}
