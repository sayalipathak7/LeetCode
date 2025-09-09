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
        if(head==null || head.next==null) return;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode h1=head;
        ListNode newH2=reverse(slow.next);
        slow.next=null;
        ListNode temp=null;
        while(newH2!=null)
        {
            temp=h1.next;
            h1.next=newH2;
            h1=temp;

            temp=newH2.next;
            newH2.next=h1;
            newH2=temp;    
        }
    
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null ||  head.next==null) return head;
        ListNode prev=head,curr=head.next;
        while(curr!=null)
        {
            ListNode nn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nn;
        }
        head.next=null;
        head=prev;
        return head;
    }
}