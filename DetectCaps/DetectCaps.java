package DetectCaps;

import java.util.Arrays;
// https://leetcode.com/problems/detect-capital/
/*
Go through each char one by one and count the capital letters than just handle the 3 cases
 */
public class DetectCaps {
    public boolean detectCapitalUse(String word) {
        int caps = 0;
        char[] words = word.toCharArray();
        for (char w : words){
            if (Character.isUpperCase(w)){ // if its a capital then keep track of how many there are in the array
                caps++;
            }
        }
        if (caps == words.length || caps == 0) return true;
        if (Character.isUpperCase(word.charAt(0)) && caps == 1) return true;
        return false;
    }
}
