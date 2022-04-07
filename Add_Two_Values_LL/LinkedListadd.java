package Add_Two_Values_LL;

// https://leetcode.com/problems/add-two-numbers/

public class LinkedListadd {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // the list for the answer
        ListNode curr = dummy; // pointer to that list so we can transverse
        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = 0;
            if (l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry; // we add the sum together of the 2 numbers and add the carry if there is one
            carry = sum / 10; // we get the carry
            ListNode node = new ListNode(sum % 10); // the value we'll get by moduloing it, will become as new node so. add it to our list
            curr.next = node; // adding it to the list
            curr = curr.next;
        }
        // making sure to add the carry at the end
        if (carry != 0){
            ListNode node = new ListNode(carry);
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
    }
}
