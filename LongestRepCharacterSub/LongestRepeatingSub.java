package LongestRepCharacterSub;

import java.util.HashMap;

// https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingSub {
    public int characterReplacement(String s, int k) {
        int sum = 0, start = 0, maxLetter = 0, maxLength = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++){
            char disChar = s.charAt(end);
            map.put(disChar,map.getOrDefault(disChar,0) + 1);
            maxLetter = Math.max(maxLetter,);
        }
        return maxLength;
    }
}
