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
    public ListNode middleNode(ListNode head) {
        ListNode current=head;
        int count=1;
        int result=0;
        while(current.next!=null){
            current=current.next;
            ++count;
        }
        System.out.println(count);
        if(count%2==0){
            result=(count/2)+1;
        }else{
            count=count-1;
            result=(count/2)+1;
        }
        System.out.println(result);
       current=head;
        int count1=1;
        while(count1<result){
            System.out.println(current.val);
            current=current.next;
            ++count1;
        }
        return current;
    }
}