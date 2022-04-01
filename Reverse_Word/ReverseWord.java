package Reverse_Word;
// https://leetcode.com/problems/reverse-words-in-a-string-iii/

/*
This works by using the Stringbuilder reverse method and breaking the string into an array then reversing the word one by one then storing it into the stringbuilder
*/
public class ReverseWord {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String i : words){
            StringBuilder temp = new StringBuilder(i);
            builder.append(temp.reverse() + " ");
        }
        return builder.toString().trim();
    }
}
