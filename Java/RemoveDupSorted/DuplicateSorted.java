package RemoveDupSorted;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class DuplicateSorted {
    public int removeDuplicates(int[] nums) {
        int c = 1;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[c++] = nums[i];
            }
        }

        return c;
    }
}
