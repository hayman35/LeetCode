package SlidingWindow;

public class MaxSubArray {
    public int maxSubArray(int[] nums, int k) {
        int windowStart = 0,windowSum = 0,sum = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++){
            windowSum += nums[windowEnd];
            sum = Math.max(windowSum,sum);
            if (windowEnd >= k-1){
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        return sum;
        // Brute Force
//        int sum = 0, res = 0;
//        for (int i = 0; i <= nums.length - k; i++){
//            sum = 0;
//            for (int j = i; j < i + k; j++){
//                sum += nums[j];
//            }
//            res = Math.max(sum,res);
//        }
//
//        return res;
    }

    public static void main(String[] args) {
        MaxSubArray leetCode = new MaxSubArray();
        int[] arr = {2, 3, 4, 1, 5};
        System.out.println(leetCode.maxSubArray(arr,2));

    }
}
