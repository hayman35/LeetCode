/**
 * https://leetcode.com/problems/concatenation-of-array/description/
 * @param {number[]} nums
 * @return {number[]}
 */
/* Time O(N) */ /* Space O(1) */
var getConcatenation = function(nums) {
    return nums.concat(nums);
};