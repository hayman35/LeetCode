package FruitsIntoBasket;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/fruit-into-baskets/submissions/
public class Fruitstotal {
    public int totalFruit(int[] fruits) {
        int maxFruit = 0, start = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int end = 0; end < fruits.length; end++){
            map.put(fruits[end],map.getOrDefault(fruits[end],0) + 1);
            while (map.size() > 2){
                map.put(fruits[start],map.get(fruits[start]) - 1);
                if (map.get(fruits[start]) == 0){
                    map.remove(fruits[start]);
                }
                start++;
            }
            maxFruit = Math.max(maxFruit,end-start+1);
        }
        return maxFruit;
    }
}
