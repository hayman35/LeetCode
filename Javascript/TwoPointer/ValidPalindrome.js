/**
 * https://leetcode.com/problems/valid-palindrome/description/
 * @param {string} s
 * @return {boolean}
 */
/* Time O(N) */ /* Space O(1) */
var isPalindrome = function(s) {
    var regexPattern = /[^A-Za-z0-9]/g;
    s = s.replace(regexPattern, "").toLowerCase();
    if (s.length === 0) return true;
    var i = 0;
    var j = s.length - 1;
    while(i<j){
        if (s[i] == s[j]){
            i++;
            j--;
        }else{
            return false;
        }
    }
    return true;
};