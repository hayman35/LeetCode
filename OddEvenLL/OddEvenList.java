package OddEvenLL;
// https://leetcode.com/problems/odd-even-linked-list/
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;
        ListNode curr = head;
        int i = 1;

        while (curr != null){
            // Odd cases
            if (i % 2 == 1){
                if (oddHead == null){
                    oddHead = curr;
                    oddTail = curr;
                }else{
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
            // Even Case
            else{
                if (evenHead == null){
                    evenHead = curr;
                    evenTail = curr;
                }else{
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            }
            i++;
            curr = curr.next;
        }
        evenTail.next = null;     // there should not be any node after even tail
        oddTail.next = evenHead; // join even list after odd
        return oddHead;
}
