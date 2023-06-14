/**
 * https://leetcode.com/problems/longest-common-prefix/description/
 * @param {string[]} strs
 * @return {string}
 */
/* Time O(N^2) */ /* Space O(N) */
var longestCommonPrefix = function(strs) {
    var lcp = strs[0];
    for (let word of strs){
        for (var j = lcp.length - 1; j >= 0; j--){
            if (word[j] !== lcp[j]){
                lcp = lcp.slice(0,j);
            }
        }
    }

    return lcp;
};