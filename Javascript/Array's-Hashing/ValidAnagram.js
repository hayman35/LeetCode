/**
 * https://leetcode.com/problems/valid-anagram/description/
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
/* Time O(N) */ /* Space O(N) */
var isAnagram = function(s, t) {
    if (s.length !== t.length) return false;

    var helper = function(str) {
        /* Space O(N) */
        var map = new Map(); 
        /* Time O(N) */ 
        for (var i = 0; i < str.length; i++){ 
            map.set(str[i], (map.get(str[i]) || 0) + 1);
        }
        return map;
    }
    /* Time O(N) */ /* Space O(N) */
    const map1 = helper(s);
    /* Time O(N) */ /* Space O(N) */
    const map2 = helper(t);

    if (map1.size !== map2.size) return false;
    for (var [key, val] of map1){
        if (map2.get(key) != val) return false;
    }
    return true;
};