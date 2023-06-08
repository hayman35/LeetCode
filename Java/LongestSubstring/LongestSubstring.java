package LongestSubstring;

import java.util.Arrays;
import java.util.HashMap;
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

/*
Sliding window problem where we use hashmap to store the distinct charcters in the string then when it
reaches greater than 1 it will move the window while keep track of the length
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0, windowStart = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char disChar = s.charAt(windowEnd);
            map.put(disChar,map.getOrDefault(disChar,0) + 1);
            while (map.get(disChar) > 1){
                char tempChar = s.charAt(windowStart);
                map.put(tempChar,map.get(tempChar) - 1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
