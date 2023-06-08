package Remove_Nth_linkedlist;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class Removenth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy; // 2 pointers one fast goes to end and one slow goes to n with simple math

        for (int i = 1; i <= n + 1; i++) fast = fast.next; // fast should be at nth

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
