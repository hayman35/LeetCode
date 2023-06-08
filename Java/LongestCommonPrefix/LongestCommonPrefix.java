package LongestCommonPrefix;
// https://leetcode.com/problems/longest-common-prefix/
/*
This works by using the first word as the prefix then whenever its not equal to the next word it takes away one letter from the end until its equal then it moves onto the next word
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() - 1);
            }
        }
        return prefix;
    }
}
