/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 * Given a string, find the length of the longest substring in it with no more than K distinct characters.
 * https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
 */
/* Time O(N) */ /* Space O(N) */
var longestSubstring = function(s, k) {
        var length = -1;
        var start = 0;
        let distinctCharCount = 0;
        const map = new Map();
        
        for (var end = 0; end < s.length; end++){
            var sChar = s[end];
            if (!map.has(sChar)) {
                distinctCharCount++;
            }
            map.set(sChar, (map.get(sChar) || 0) + 1);
            while (distinctCharCount > k){
                const leftChar = s[start];
                const leftCharCount = map.get(leftChar);
                if (leftCharCount === 1) {
                    map.delete(leftChar);
                    distinctCharCount--;
                } else {
                    map.set(leftChar, leftCharCount - 1);
                }
                start++;
            }
            length = Math.max(length, end - start + 1);
        }
        
        return length;
    
};