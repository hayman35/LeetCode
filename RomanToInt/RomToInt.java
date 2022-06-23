package RomanToInt;

// https://leetcode.com/problems/roman-to-integer/
public class RomToInt {
    public int romanToInt(String s) {
        int res = 0;
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");

        for (int i = 0; i < s.length(); i++){
            char rom = s.charAt(i);
            switch (rom){
                case 'I':
                    res +=1;
                    break;
                case 'V':
                    res +=5;
                    break;
                case 'X':
                    res+=10;
                    break;
                case 'L':
                    res+=50;
                    break;
                case 'C':
                    res+=100;
                    break;
                case 'D':
                    res+=500;
                    break;
                case 'M':
                    res+=1000;
                    break;
            }
        }


        return res;
    }
}
