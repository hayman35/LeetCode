package ReverseCharArrayWords;

import java.util.Arrays;

public class ReverseChar {
    private static void reverseWord(char[] a){
        reverseArray(a,0,a.length-1);
        int start = 0;
        int end = 0;
        while (end < a.length) {
            if (a[end] == ' ') {
                reverseArray(a, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        reverseArray(a,start,end-1);
        System.out.println(Arrays.toString(a));
    }

    private static void reverseArray(char[] a, int start, int end){
        while (start < end){
            char temp = a[start];
            a[start++] = a[end];
            a[end--] = temp;
        }
    }

    public static void main(String[] args) {
        reverseWord(new char[]{'G', 'O', 'O', 'D',  ' ' , 'A', 'M',  ' ', 'I'});
    }
}
