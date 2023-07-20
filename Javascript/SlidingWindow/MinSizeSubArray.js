/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 */
/* Time O(N) */ /* Space O(1) */
var minSubArrayLen = function(target, nums) {
    var start = 0;
    var sum = 0;
    var minLength = Infinity;
    for(var end = 0; end < nums.length; end++){
        sum += nums[end]

        while (sum >= target){
            minLength = Math.min(minLength, end - start + 1);
            sum -= nums[start];
            start++;
        }
    }
    if (minLength == Infinity){
        return 0;
    }
    return minLength;
};