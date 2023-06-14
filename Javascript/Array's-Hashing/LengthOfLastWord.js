/**
 * https://leetcode.com/problems/length-of-last-word/description/
 * @param {string} s
 * @return {number}
 */
/* Time O(N) */ /* Space O(1) */
var lengthOfLastWord = function(s) {
    s = s.trim();
    var i = s.length - 1;
    var max = 0;
    for (i; i>=0; i--){
        if (s[i] === ' '){
            return max;
        }else{
            max++;
        }
    }
    return max;
};