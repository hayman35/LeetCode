package CodeSignal;

import java.util.HashMap;

// https://app.codesignal.com/interview-practice/task/pMvymcahZ8dY4g75q/description
public class FirstDup {
    int solution(int[] a) {
        int start = 0, minPos = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int end = 0; end < a.length; end++){
            map.put(a[end],map.getOrDefault(a[end],0) + 1);
            if (map.get(a[end]) > 1){
                minPos = Math.min(minPos, end);
            }

        }
        return minPos == Integer.MAX_VALUE ? -1:a[minPos];
    }

}
