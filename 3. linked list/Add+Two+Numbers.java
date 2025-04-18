/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = head;
        
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            
            int val = sum%10;
            carry = sum/10;
            
            if (current == null) {
                head = new ListNode(val);
                current = head;
            }
            else {
                current.next = new ListNode(val);
                current = current.next;
            }
        }
        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return head;
    }
}
