package DecimalValue_LL;

// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
/*
We transverse through the list and keep counting how many nodes there are, then we transverse again but this time counter is going down by one each time
 */
public class DecimalValue {
    public int getDecimalValue(ListNode head) {
        int counter = -1;
        int ans = 0;
        ListNode dummy = head;
        ListNode dummy2 = head;
        while (dummy != null){
            dummy = dummy.next;
            counter++;
        }

        while(dummy2 != null){
            if (dummy2.val == 1){
                ans += (int)Math.pow(2,counter);
                counter--;
            }else{
                counter--;
            }
            dummy2 = dummy2.next;
        }
        return ans;
    }
}
