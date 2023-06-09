/**
 * https://leetcode.com/problems/two-sum/description/
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
/* Time O(N) */ /* Space O(N) */
var twoSum = function(nums, target) {
    var map = new Map(); /* Space O(N) */
    for (var i = 0; i < nums.length; i++){ /* Time O(N) */
        var num = nums[i];
        var comp = target - num;
        var sumIndex = map.get(comp);
        
        const isTarget = map.has(comp);
        if (isTarget) return [i,sumIndex];
        map.set(num,i); /* Time O(N) */
    }
    return [-1,-1];
};