package Missing_Number;
// https://leetcode.com/problems/missing-number/
public class MissingNumberSol {
    public int missingNumber(int[] nums) {
        // finding the length of the array and using a formula to find the total sum of what it should be
        int n = nums.length;
        int total = n * (n + 1) / 2; // the formula of how to find the total number
        int sum = 0;

        for (int i: nums){ // finding the sum of the array
            sum += i;
        }

        return total - sum; // the result will be what number is left out
    }
}
