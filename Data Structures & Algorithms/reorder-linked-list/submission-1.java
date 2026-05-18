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
    ListNode slow=head;
    ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //slow is mid
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev=null;
        ListNode curr=second;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        second=prev;
        while(head!=null && second!=null){
        ListNode temp1=head.next;
        ListNode temp2=second.next;
        head.next=second;
        second.next=temp1;
        head=temp1;
        second=temp2;
        }

    return ;}
}
