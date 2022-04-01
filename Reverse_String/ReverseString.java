package Reverse_String;

// https://leetcode.com/problems/reverse-string/
/*
This works by having 2 pointers one at the start and one at the end, then switching each char based on those 2 pointers
* */
public class ReverseString {
    public void reverseString(char[] s) {
        int min = 0;
        int max = s.length - 1;

        while (min < max){
            char temp = s[min];
            s[min] = s[max];
            s[max] = temp;
            min++;
            max--;
        }

    }
}
