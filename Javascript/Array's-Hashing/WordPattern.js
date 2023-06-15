/**
 * https://leetcode.com/problems/word-pattern/description/
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
/* Time O(N) */ /* Space O(N) */
var wordPattern = function(pattern, s) {
    var map = new Map();
    var map2 = new Map();
    s = s.split(' ');
    if (pattern.length !== s.length) return false;
        
    for (var i = 0; i < pattern.length; i++){
        if (!map.has(pattern[i]) && !map2.has(s[i])){
            map.set(pattern[i],s[i]);
            map2.set(s[i],pattern[i]);
        }
        else{
            if (!(map.get(pattern[i]) === s[i])){
                return false;
            }
        }
    }
    return true;
};