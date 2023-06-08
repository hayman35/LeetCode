// https://leetcode.com/problems/contains-duplicate/
var containsDuplicate = function(nums) {
    const set = new Set();
    for (var i = 0; i < nums.length; i++){
        if (!set.has(nums[i])) {
            set.add(nums[i]);
        }else{
            return true
        }
    }
    return false;
};