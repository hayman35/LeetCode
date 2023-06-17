/**
 * https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
/* Time O(NLogN) */ /* Space O(1) */
var minimumDifference = function(nums, k) {
    let start = 0, end = k-1, min = Infinity;
    if (nums.length == 1) return 0;
    nums = nums.sort(function(a, b){return a-b});
    while (end < nums.length){
        min = Math.min(Math.abs(nums[start] - nums[end]), min);
        start++;
        end++;
    }
    return min;
};