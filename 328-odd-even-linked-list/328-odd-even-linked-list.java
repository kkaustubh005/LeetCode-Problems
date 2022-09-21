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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode ptr=head;
        ListNode ptr2=dummy;
        if(head == null) return null;
        ptr2.next=ptr.next;
        ptr2=ptr2.next;
        ListNode evenHead=ptr2;
        
        while(ptr2!=null && ptr2.next!=null){
            ptr.next=ptr.next.next;
            ptr=ptr.next;
            ptr2.next=ptr.next;
            ptr2=ptr2.next;
        }
        ptr.next=evenHead;
        ptr=ptr.next;
        return head;
    }
}