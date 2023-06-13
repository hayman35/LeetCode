/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
 * @param {number[]} arr
 * @return {number[]}
 * Time O(N) | Space O(1)
 */
var replaceElements = function(arr) {
    var max = -1;
    for (var i = arr.length - 1; i >=0; i--){
        const cur = arr[i];
        arr[i] = max;
        max = Math.max(cur,max);
    }
    
    return arr;
};