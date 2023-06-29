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
    public ListNode deleteMiddle(ListNode head) {
        ListNode ptr = head;
        int count=0;
        
        while(ptr!=null){
            ++count;
            ptr=ptr.next;
        }
        
        if(count==1)
            return null;
        
        int endPoint=count/2;
        int n=1;
        ptr = head;
        while(n!=endPoint){
            ptr=ptr.next;
            ++n;
        }
        ptr.next=ptr.next.next;
        return head;
    }
}