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
        if(count%2==0){
            int endPoint=(count/2)+1;
            int n=1;
            ptr = head;
            while(n!=endPoint-1){
                ptr=ptr.next;
                ++n;
            }
            ptr.next=ptr.next.next;
            return head;
        }else{
            int endPoint=(count+1)/2;
            int n=1;
            ptr = head;
            while(n!=endPoint-1){
                ptr=ptr.next;
                ++n;
            }
            ptr.next=ptr.next.next;
            return head;
        }
    }
}