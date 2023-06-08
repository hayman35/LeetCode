package MergedTwoLLSorted;
// https://leetcode.com/problems/merge-two-sorted-lists/
public class Merged {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode merged = new ListNode(0);
        ListNode ptrMerged = merged;

        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                ptrMerged.next = list1;
                list1 = list1.next;
            }else{
                ptrMerged.next = list2;
                list2 = list2.next;
            }
            ptrMerged = ptrMerged.next;

            if (list1 == null){
                ptrMerged.next = list2;
            }
            if (list2 == null){
                ptrMerged.next = list1;
            }
        }
        return merged.next;
    }
}
