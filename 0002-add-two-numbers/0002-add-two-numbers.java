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
        int carry=0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while(l1!=null && l2!=null) {
            int sum = l1.val + l2.val + carry;
            int value = sum%10;
            carry = sum/10;
            current.next = new ListNode(value);
            current=current.next;
            l1=l1.next;
            l2=l2.next;        
        }
        
        if(l1==null) {
            while(l2!=null) {
                int sum = l2.val + carry;
                int value = sum%10;
                carry = sum/10;
                current.next = new ListNode(value);
                current=current.next;
                l2=l2.next;
            }
        } else {
            while(l1!=null) {
                int sum = l1.val + carry;
                int value = sum%10;
                carry = sum/10;
                current.next = new ListNode(value);
                current=current.next;
                l1=l1.next;
            }          
        }
        if(carry!=0) {
            current.next = new ListNode(carry);
            current=current.next;
        }
        return dummy.next;
    }
}