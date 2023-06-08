package SortByParity;

// https://leetcode.com/problems/sort-array-by-parity/
public class SortParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int end = nums.length - 1;
        int start = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){ // even
                res[start] = nums[i];
                start++;
            }else{ // odd
                res[end] = nums[i];
                end--;
            }
        }
        return res;
    }
}
