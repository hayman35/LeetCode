package TwoPointer;

import java.util.Arrays;

public class PairWithSum {
    public static int[] search(int[] arr, int targetSum){
        int ptr1 = 0;
        int ptr2 = arr.length - 1;
        while (ptr1 < ptr2){
            if ((arr[ptr1] + arr[ptr2]) == targetSum){
                return new int[]{ptr1,ptr2};
            }
            else if ((arr[ptr1] + arr[ptr2]) > targetSum){
                ptr2--;
            }else{
                ptr1++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(search(new int[]{2, 5, 9, 11}, 11)));
    }
}
