package IsPalindrome;
// https://leetcode.com/problems/valid-palindrome/submissions/
/*
This works by replacing all special characters in the string then using strinbuilder to reverse it then comparing the 2 strings
 */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        String m = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder builder = new StringBuilder(m.toLowerCase());
        builder.reverse();
        if (builder.toString().equals(m.toLowerCase())) return true;
        return false;
    }
}
