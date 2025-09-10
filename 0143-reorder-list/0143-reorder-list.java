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
        if(head==null)return;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode h1=head;
        ListNode h2=rev(slow.next);
        slow.next=null;
        ListNode t=null;
        while(h2!=null)
        {
            t=h1.next;
            h1.next=h2;
            h1=t;

            t=h2.next;
            h2.next=h1;
            h2=t;

        }
      

        
    }
    public ListNode rev(ListNode head)
    {
        if(head==null || head.next==null)return head;
        ListNode curr=head.next,prev=head;
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