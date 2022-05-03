package CodeSignal;

import java.util.LinkedHashMap;

// https://app.codesignal.com/interview-practice/task/uX5iLwhc6L5ckSyNC/description
public class FirstNonrepChar {
    char solution(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++){
            char disChar = s.charAt(i);
            map.put(disChar, map.getOrDefault(disChar, 0) + 1);
        }
        for (char a : map.keySet()){
            if (map.get(a) == 1){
                return a;
            }
        }
        return '_';
    }
}
