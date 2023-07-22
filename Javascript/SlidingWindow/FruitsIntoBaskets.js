/**
 * @param {number[]} fruits
 * @return {number}
 * https://leetcode.com/problems/fruit-into-baskets/
 */
/* Time O(N) */ /* Space O(N) */
var totalFruit = function(fruits) {
    var length = 0,
    start = 0;
    var map = new Map();

    for (var end = 0; end < fruits.length; end++){
        var rightFruit = fruits[end];
        map.set(rightFruit, (map.get(rightFruit) ?? 0) + 1);
        if (map.size > 2){
            var leftFruit = fruits[start];
            map.set(leftFruit, map.get(leftFruit) - 1);
            start++;
            if (map.get(leftFruit) === 0){
                map.delete(leftFruit);
            }
            
        }else {
            length = Math.max(length, end - start + 1);
        }
    }
    return length;
};