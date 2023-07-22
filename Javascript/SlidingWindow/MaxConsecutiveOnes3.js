/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 */
/* Time O(N) */ /* Space O(1) */
var longestOnes = function(nums, k) {
    let start = 0, length = 0, onesCount = 0;

   for (let end = 0; end < nums.length; end++){
       if (nums[end] === 1){
           onesCount++;
       }
      

       if ((end - start + 1 - onesCount) > k){
          if (nums[start] === 1){
              onesCount--;
          }
          start++;
       }
       length = Math.max(length, end - start + 1);
   }

   return length;
};