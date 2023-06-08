package SlidingWindow;


import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {

        System.out.println(findLength("araaci",2));
    }
    public static int findLength(String str, int k){
        int lengthOfString = 0, windowStart = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char disChar = str.charAt(windowEnd);
            map.put(disChar,map.getOrDefault(disChar,0) + 1);
            System.out.println(Arrays.asList(map));
            while (map.size() > k){
                char tempChar = str.charAt(windowStart);
                map.put(tempChar,map.get(tempChar) - 1);
                if (map.get(tempChar) == 0){
                    map.remove(tempChar);
                }
                windowStart++;
            }
            lengthOfString = Math.max(lengthOfString, windowEnd - windowStart + 1);
        }
        return lengthOfString;
    }
}
