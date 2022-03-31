package Remove_dup_Linkedlist;
import java.util.HashSet;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDup {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>(); // using Hashset to store unqiue values in the list
        ListNode currentNode = head;
        ListNode prev = null;
        while(currentNode != null){ // keep looping until the end of the list which is alwatys null
            int curVal = currentNode.val;
            if (set.contains(curVal)){
                prev.next = currentNode.next;  // when its a duplicate then set the prev node to skip the current node
            }else{
                set.add(curVal);
                prev = currentNode;
            }
            currentNode = currentNode.next;
        }
        return head;
    }
}
