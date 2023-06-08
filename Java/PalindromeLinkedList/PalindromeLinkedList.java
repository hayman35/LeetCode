package PalindromeLinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> nodes = new ArrayList<>();
        ListNode cur = head;
        while (cur != null){
            nodes.add(cur.val);
            cur = cur.next;
        }
        ArrayList<Integer> rNodes = new ArrayList<>(nodes);
        Collections.reverse(rNodes);
        return nodes.equals(rNodes);
    }
// Recursive solution
//    ListNode node;
//    public boolean isPalindrome(ListNode head) {
//        if (head == null) return true;
//        if (node == null) node = head;
//
//        boolean isPal = isPalindrome(head.next);
//
//        if (node.val == head.val){
//            node = node.next;
//        }else{
//            node = node.next;
//            isPal = false;
//        }
//        return isPal;
//    }
}
