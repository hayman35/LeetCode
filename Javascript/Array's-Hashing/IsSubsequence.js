/**
 * https://leetcode.com/problems/is-subsequence/description/
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
/* Time O(N) */ /* Space O(1) */
var isSubsequence = function(s, t) {
    var i = 0;
    var j = 0;
    while(i < s.length && j < t.length){
        if (s[i] == t[j]){
            i++;
            j++;
        }else{
            j++;
        }
    }
    return i === s.length;
 };
 