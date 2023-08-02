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
    public void reorderList(ListNode head) {
        if(head == null)
            return;
        
        //Find middle node - slow node will be middle node
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //reverse list from middle node(slow)        
        ListNode prev = null, current=slow, temp;
        while(current!=null) {
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        //prev is the last node here
        
        //Merge two list
        ListNode first = head, second=prev;
        
        while(second.next!=null) {
            temp=first.next;
            first.next=second;
            first=temp;
            
            temp=second.next;
            second.next=first;
            second=temp;
        }     
    }
}