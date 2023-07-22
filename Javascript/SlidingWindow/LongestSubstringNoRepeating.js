/**
 * @param {string} s
 * @return {number}
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
/* Time O(N) */ /* Space O(N) */
var lengthOfLongestSubstring = function(s) {
    let length = 0,
    start = 0;
    map = new Map();

    for (let end = 0; end < s.length; end++){
        let rightChar = s[end];
        map.set(rightChar, (map.get(rightChar) ?? 0) + 1);
        while (map.get(rightChar) > 1){
            let leftChar = s[start];
            map.set(leftChar, map.get(leftChar) - 1);
            if (map.get(leftChar) === 0){
                map.delete(leftChar);
            }
            start++;
        }if (map.get(rightChar) >= 1){
            length = Math.max(length, end - start + 1);
        }
    }
    return length;
};