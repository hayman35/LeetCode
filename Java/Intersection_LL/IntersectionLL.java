package Intersection_LL;
// https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/
public class IntersectionLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummy_A = headA;
        ListNode dummy_B = headB;
        int countA = 0;
        int countB = 0;
        int diff = 0;

        // First get the length count of A
        while(dummy_A != null){
            countA++;
            dummy_A = dummy_A.next;
        }

        // then get the length count of B
        while(dummy_B != null){
            countB++;
            dummy_B = dummy_B.next;

        }

        // See which is bigger then the bigger one tranverses upto the difference to "catch-up"
        if (countA > countB){
            diff = countA - countB;
            for (int i = 0; i < diff; i++){
                headA = headA.next;
            }
        }else{
            diff = countB - countA;
            for (int i = 0; i < diff; i++){
                headB = headB.next;
            }
        }
        // both same length now we transverse and see if they equal
        while (headA != null && headB != null){
            if (headA == headB) return headB;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
}
