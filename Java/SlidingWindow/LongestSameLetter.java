package SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSameLetter {
    public static void main(String[] args) {
        findLength("aabccbb",2);
    }
    public static int findLength(String str, int k){
        int maxLength = 0, start = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int end = 0; end < str.length(); end++){
            char disChar = str.charAt(end);
            map.put(disChar,map.getOrDefault(disChar,0) + 1);
            while (map.get(disChar) > k){
                char tempChar = str.charAt(start);
                map.put(tempChar,map.get(tempChar) - 1);
                if (map.get(tempChar) == 0){
                    map.remove(tempChar);
                }
                start++;
                System.out.println(Arrays.asList(map));
            }
            maxLength = Math.max(maxLength,end-start + 1);
        }

        return maxLength;

    }
}
