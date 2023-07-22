/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 */
/* Time O(N) */ /* Space O(N) 
Use an Array instead of Map to make space O(1)*/
var characterReplacement = function(s, k) {
    let length = 0, start = 0, maxRC = 0;
    let map = new Map();
    for (let end = 0; end < s.length; end++){
        let rightChar = s[end];
        map.set(rightChar, (map.get(rightChar) ?? 0) + 1);
        maxRC = Math.max(maxRC, map.get(rightChar));

        if ((end - start + 1 - maxRC) > k){
            let leftChar = s[start];
            map.set(leftChar, map.get(leftChar) - 1);
            start++;
            if (map.get(leftChar) === 0){
                map.delete(leftChar);
            }
        }
        length = Math.max(length, end - start + 1);
    }
    return length;
};