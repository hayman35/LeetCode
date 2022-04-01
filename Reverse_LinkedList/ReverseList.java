package Reverse_LinkedList;
// https://leetcode.com/problems/reverse-linked-list/submissions/
/*
This is being solved by storing all the numbers in a list then using the built in reverse method then storing back into the linked list
*/
public class ReverseList {
    // Brute Force
//    public ListNode reverseList(ListNode head) {
//        List<Integer> list = new ArrayList<Integer>();
//        ListNode result = new ListNode();
//        ListNode result1 = new ListNode();
//        result = head;
//        result1 = head;
//        if (head == null) return head;
//
//        while(head != null){
//            list.add(head.val);
//            head = head.next;
//        }
//        Collections.reverse(list);
//        int count = 0;
//        while(result != null){
//            result.val = list.get(count);
//            result = result.next;
//            count++;
//        }
//        return result1;
//    }
    // o(n) time and 0(1) space
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur != null){
            next = cur.next; // save the next node
            cur.next = prev; // reverse the reference
            prev = cur; // advance prev
            cur = next; // advance cur
        }
        return prev;
    }
}
