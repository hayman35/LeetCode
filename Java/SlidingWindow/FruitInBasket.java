package SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FruitInBasket {
    public static void main(String[] args) {
        findLength(new char[]{'A', 'B', 'C', 'A', 'C'});
    }
    public static int findLength(char[] arr){
        int maxFruit = 0, start = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int end = 0; end < arr.length; end++){
            map.put(arr[end],map.getOrDefault(arr[end],0) + 1);
            System.out.println(Arrays.asList(map));
            while (map.size() > 2){
                map.put(arr[start],map.get(arr[start]) - 1);
                if (map.get(arr[start]) == 0){
                    map.remove(arr[start]);
                }
                start++;
            }
            maxFruit = Math.max(maxFruit,end-start+1);
        }
        System.out.println(maxFruit);
        return maxFruit;
    }
}
