// https://leetcode.com/problems/contains-duplicate/

/* Time O(N) */ /* Space O(N) */
var containsDuplicate = function(nums) {
     /* Space O(N) */
    const set = new Set();
    /* Time O(N) */
    for (var i = 0; i < nums.length; i++){ 
        if (!set.has(nums[i])) { /* Time O(1) */
            set.add(nums[i]); /* Time O(1) */
        }else{
            return true
        }
    }
    return false;
};