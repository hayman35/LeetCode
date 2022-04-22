package TwoSum2;

import java.util.HashMap;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumTwo {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();

        for (int i = 0; i < numbers.length; i++){
            hash.put(numbers[i],i);

            Integer diff =  target - numbers[i];

            if (hash.containsKey(diff)){
                int res[] = {hash.get(diff)+1,i+1};
                return res;
            }
        }
        return new int[2];
    }
}
