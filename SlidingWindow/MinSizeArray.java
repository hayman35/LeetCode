package SlidingWindow;

// https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinSizeArray {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart = 0, windowSum = 0, minLength = Integer.MAX_VALUE;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            while (windowSum >= target) {
                minLength = Math.min(minLength, (windowEnd - windowStart + 1));
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;




        // Brute Force Way
       /*
       int p = Integer.MAX_VALUE;
       for (int i = 0; i < arr.length; i++){
           int sum = 0;
           int res = 0;
           for (int j = i; j < arr.length; j++){
               sum += arr[j];
               res++;
               if (sum >= s){
                   if (res < p) p = res;
                   break;
               }
           }
       }
       return p;
        */
    }
}
