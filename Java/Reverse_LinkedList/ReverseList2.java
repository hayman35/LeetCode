package Reverse_LinkedList;
// https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // In case of empty list return null
        if (head == null) {
            return null;
        }
        int count = 1;

        // Move curr and prev until they reach proper starting point in the list
        ListNode cur = head;

        ListNode prev = null;

        while (cur != null && count < left){
            prev = cur;
            cur = cur.next;
            count++;
        }


        ListNode beforeNode = prev; // A node before the subList's node
        ListNode subHead = cur; // Sublist's first node
        ListNode next;

        // Reverse the sublist
        while (cur != null && count <= right){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }

        // Fix the connections
        if (beforeNode != null){
            beforeNode.next = prev;
        }else{
            head = prev;
        }

        subHead.next = cur;

        return head;

    }
